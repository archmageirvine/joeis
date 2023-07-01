package irvine.oeis.a096;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A096098 a(1) = 2, a(2) = 1; for n &gt;= 3, a(n) = least number not included earlier that divides the concatenation of all previous terms.
 * @author Sean A. Irvine
 */
public class A096098 extends Sequence1 implements Closeable {

  // This essentially verifies the content of a resource stream and does
  // not actually generate any additional terms.
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private final BufferedReader mInput;
  private final StringBuilder mN = new StringBuilder();
  protected final HashSet<Z> mSeen = new HashSet<>();
  private final ArrayList<Z> mSeq = new ArrayList<>();
  protected final PrimeDivision mFactor = new PrimeDivision();
  private int mPos = -1;

  /**
   * Construct this sequence.
   */
  public A096098() {
    mInput = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("irvine/factor/project/oeis/a096098")));
  }

  private void process(final String line) throws IOException {
    final int sp = line.indexOf(' ');
    if (sp == -1) {
      throw new IOException(line);
    }
    try {
      final int pos = Integer.parseInt(line.substring(0, sp));
      if (pos != mSeq.size() + 1) {
        throw new IOException(line);
      }
      final Z term = getTerm(line.substring(sp + 1), mN.length() == 0 ? Z.TWO : new Z(mN.toString()));
      if (!mSeen.add(term)) {
        throw new IOException("Replicated: " + line);
      }
      mN.append(term.toString());
      mSeq.add(term);
      if (mVerbose) {
        System.out.println(mSeq.size() + " " + term);
        System.out.println("N = " + mN);
      }
    } catch (final NumberFormatException e) {
      throw new IOException("Malformed line: " + line, e);
    }
  }

  @Override
  public void close() throws IOException {
    mInput.close();
  }

  @Override
  public Z next() {
    try {
      String line;
      while ((line = mInput.readLine()) != null) {
        if (line.isEmpty() || line.startsWith("#")) {
          continue;
        }
        process(line);
        return mSeq.get(++mPos);
      }
      close();
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    throw new UnsupportedOperationException();
  }

  private void checkLength(final String s, final Z n, final String line) {
    final int len = Integer.parseInt(s.substring(1));
    if (n.toString().length() != len) {
      throw new RuntimeException("Length mismatch: " + line);
    }
  }

  private Z getTerm(final String factorization, Z n) {
    if ("1".equals(factorization)) {
      return Z.ONE;
    }
    if ("2".equals(factorization)) {
      return Z.TWO;
    }
    final String[] parts = factorization.split("\\.");
    final Z p0 = new Z(parts[0]);
    if (!n.mod(p0).isZero()) {
      throw new RuntimeException("Does not divide: " + p0);
    }
    n = n.divide(p0);
    final FactorSequence fs;
    if (p0.isProbablePrime()) {
      fs = new FactorSequence();
      fs.add(p0, FactorSequence.PROB_PRIME);
    } else {
      fs = mFactor.factorize(p0);
    }
    for (int k = 1; k < parts.length; ++k) {
      final String pk = parts[k];
      if (pk.startsWith("P")) {
        checkLength(pk, n, factorization);
        if (!n.isProbablePrime()) {
          throw new RuntimeException("Not prime: " + n + " cf. " + factorization);
        }
        fs.add(n, FactorSequence.PROB_PRIME);
        n = Z.ONE;
      } else if (pk.startsWith("C")) {
        checkLength(pk, n, factorization);
        if (n.isProbablePrime()) {
          throw new RuntimeException("Not composite: " + n + " cf. " + factorization);
        }
        fs.add(n, FactorSequence.COMPOSITE);
        n = Z.ONE;
      } else {
        final Z p = new Z(pk);
        if (!p.isProbablePrime()) {
          throw new RuntimeException("Not prime: " + pk + " cf. " + factorization);
        }
        if (!n.mod(p).isZero()) {
          throw new RuntimeException(p + " not div " + n + " in line " + factorization);
        }
        n = n.divide(p);
        fs.add(p, FactorSequence.PROB_PRIME);
      }
    }
    if (!Z.ONE.equals(n)) {
      throw new RuntimeException("Incomplete: " + n);
    }
    final Z[] div = fs.divisors(false);
    Arrays.sort(div);
    for (final Z d : div) {
      if (mSeen.contains(d)) {
        continue;
      }
      if (d.equals(p0)) {
        return p0; // sequence is correct
      }
      throw new RuntimeException("Smallest should be " + d + " in line " + factorization);
    }
    throw new RuntimeException("Problem with: " + factorization);
  }

}
