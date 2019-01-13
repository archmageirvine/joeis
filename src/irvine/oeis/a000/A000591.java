package irvine.oeis.a000;

//import java.util.Arrays;

//import irvine.math.IntegerUtils;
//import irvine.math.group.SymmetricGroup;
//import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000591.
 * @author Sean A. Irvine
 */
public class A000591 implements Sequence {

  /*
  private int mN = 1;
  private Z mF = Z.TWO;

  // See p. 149 "Graphical Enumeration"

  private long mSum(final int p, final int q, final int[] jAlpha) {
    // These numbers will be fairly small, so work with ordinary integers
    final int lcm = IntegerUtils.lcm(p, q);
    // Sum over divisors, again do this naively because numbers small
    long mSum = 0;
    for (int s = 1; s <= lcm; ++s) {
      if (lcm % s == 0) {
        mSum += s * jAlpha[s];
      }
    }
    return mSum;
  }

  private Z powerSum(final int p, final int q, final int[] jAlpha, final int[] jBeta) {
    final int pow = IntegerUtils.gcd(p, q) * jAlpha[p] * jBeta[q];
    return Z.valueOf(mSum(p, q, jAlpha)).pow(pow);
  }

  private Z innerProduct(final int p, final int[] jAlpha, final int[] jBeta) {
    return powerSum(p, 1, jAlpha, jBeta).multiply(powerSum(p, 2, jAlpha, jBeta));
  }

  private Z outerProduct(final int n, final int[] jAlpha, final int[] jBeta) {
    Z prod = Z.ONE;
    for (int p = 1; p <= n - 2; ++p) {
      prod = prod.multiply(innerProduct(p, jAlpha, jBeta));
    }
    return prod;
  }

  private Z outerSum(final int n) {
    Z mSum = Z.ZERO;
    // todo convert to partition form
    // todo perhaps not summing over enough forms or should be some multpliers
    final SymmetricGroup<Integer> sn = SymmetricGroup.create(n);
    final SymmetricGroup<Integer> s2 = SymmetricGroup.create(2);
    for (final Permutation<Integer> alpha : sn) {
      //final Permutation<Integer> iAlpha = sn.negate(alpha);
      final int[] jAlpha = alpha.cycleLengths();
      for (final Permutation<Integer> beta : s2) {
        final int[] jBeta = beta.cycleLengths();
        int count = 1;
        // XXX I think the inner sums are probably right -- I just don't know 
        // what the mSum is actually supposed to be over
        mSum = mSum.add(outerProduct(n, jAlpha, jBeta).multiply(count));
        System.out.println("jAlpha=" + Arrays.toString(jAlpha) + " jBeta=" + Arrays.toString(jBeta) + " n=" + n + " mSum now " + mSum);
      }
    }
    return mSum;
  }
  */

  @Override
  public Z next() {
    throw new UnsupportedOperationException();
    /*
    final Z unscaled = outerSum(++mN);
    if (mN > 2) {
      mF = mF.multiply(mN - 2);
    }
    System.out.println(unscaled + "/" + mF);
    return unscaled.divide(mF);
    */
  }
}
