package irvine.oeis.a096;

import java.util.Arrays;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FactorizationSequence;

/**
 * A096098 <code>a(1) = 2, a(2) = 1;</code> for <code>n &gt;= 3, a(n) =</code> least number not included earlier that divides the concatenation of all previous terms.
 * @author Sean A. Irvine
 */
public class A096098 extends FactorizationSequence {

  /**
   * Construct this sequence.
   */
  public A096098() {
    super("irvine/factor/project/oeis/a096098");
  }

  private void checkLength(final String s, final Z n, final String line) {
    final int len = Integer.parseInt(s.substring(1));
    if (n.toString().length() != len) {
      throw new RuntimeException("Length mismatch: " + line);
    }
  }

  @Override
  protected Z getTerm(final String factorization, Z n) {
    if ("1".equals(factorization)) {
      return Z.ONE;
    }
    if ("2".equals(factorization)) {
      return Z.TWO;
    }
    final String[] parts = factorization.split("\\.");
    final Z p0 = new Z(parts[0]);
    if (!Z.ZERO.equals(n.mod(p0))) {
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
        if (!Z.ZERO.equals(n.mod(p))) {
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
