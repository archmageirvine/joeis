package irvine.oeis;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;

/**
 * Verifies a factorization sequence.
 * @author Sean A. Irvine
 */
public class FactorizationSequence implements Sequence, Closeable {

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
   * @param resource location of factors file
   */
  public FactorizationSequence(final String resource) {
    mInput = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(resource)));
  }

  protected Z getTerm(final String factorization, final Z n) {
    final String[] p = factorization.split("\\.");
    final String lpf = p[0];
    if (lpf.startsWith("(")) {
      throw new UnsupportedOperationException("Unfactored: " + n);
    }
    return new Z(lpf);
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
}
