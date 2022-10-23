package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.UnimplementedException;

/**
 * A000591 Number of n-state 2-input 1-output automata with one initial and one terminal state.
 * @author Sean A. Irvine
 */
public class A000591 extends Sequence1 {

//  private int mN = 1;
//  private Z mF = Z.TWO;
//
//  // See p. 149 "Graphical Enumeration"
//
//  private long sum(final int p, final int q, final int[] jAlpha) {
//    // These numbers will be fairly small, so work with ordinary integers
//    final int lcm = IntegerUtils.lcm(p, q);
//    // Sum over divisors, again do this naively because numbers small
//    long sum = 0;
//    for (int s = 1; s <= lcm; ++s) {
//      if (s < jAlpha.length && lcm % s == 0) {
//        sum += s * jAlpha[s];
//      }
//    }
//    return sum;
//  }
//
//  private Z powerSum(final int p, final int q, final int[] jAlpha, final int[] jBeta) {
//    final int pow = IntegerUtils.gcd(p, q) * jAlpha[p] * jBeta[q];
//    return Z.valueOf(sum(p, q, jAlpha)).pow(pow);
//  }
//
//  private Z innerProduct(final int p, final int[] jAlpha, final int[] jBeta) {
//    return powerSum(p, 1, jAlpha, jBeta).multiply(powerSum(p, 2, jAlpha, jBeta));
//  }
//
//  private Z outerProduct(final int n, final int[] jAlpha, final int[] jBeta) {
//    Z prod = Z.ONE;
//    for (int p = 1; p <= n - 2; ++p) {
//      prod = prod.multiply(innerProduct(p, jAlpha, jBeta));
//    }
//    return prod;
//  }
//
//  private Z outerSum1(final int n) {
//    Z sum = Z.ZERO;
////    if (n == 2) {
////      return Z.valueOf(20);
////    }
//    // todo convert to partition form
//    // todo perhaps not summing over enough forms or should be some multpliers
//    final SymmetricGroup<Integer> sn = SymmetricGroup.create(n);
//    final SymmetricGroup<Integer> s2 = SymmetricGroup.create(2);
//    for (final Permutation<Integer> alpha : sn) {
//      //final Permutation<Integer> iAlpha = sn.negate(alpha);
//      final int[] jAlpha = alpha.cycleLengths();
//      for (final Permutation<Integer> beta : s2) {
//        final int[] jBeta = beta.cycleLengths();
//        int count = 1;
//        // XXX I think the inner sums are probably right -- I just don't know
//        // what the sum is actually supposed to be over
//        sum = sum.add(outerProduct(n, jAlpha, jBeta).multiply(count));
//        System.out.println("jAlpha=" + Arrays.toString(jAlpha) + " jBeta=" + Arrays.toString(jBeta) + " n=" + n + " sum now " + sum);
//      }
//    }
//    return sum;
//  }
//
//  // todo this is kind of close, initially too high and later too small
//  // for the smaller ones can delete a few rows to get correct value
//  // suspect the permutations iterating over is the real problem
//  private Z outerSum(final int n) {
//    Z sum = Z.ZERO;
//    final int m = n; // - 2;
//    final IntegerPartition partAlpha = new IntegerPartition(m);
//    final int[] jAlpha = new int[m + 1];
//    int[] pAlpha;
//    while ((pAlpha = partAlpha.next()) != null) {
//      IntegerPartition.toCountForm(pAlpha, jAlpha);
//      final int r = 2;
//      final IntegerPartition partBeta = new IntegerPartition(r);
//      final int[] jBeta = new int[r + 1];
//      int[] pBeta;
//      while ((pBeta = partBeta.next()) != null) {
//        IntegerPartition.toCountForm(pBeta, jBeta);
//        final Z contrib = outerProduct(n, jAlpha, jBeta);
//        sum = sum.add(contrib);
//        System.out.println("jAlpha=" + Arrays.toString(jAlpha) + " jBeta=" + Arrays.toString(jBeta) + " n=" + n + " contrib " + contrib);
//      }
//    }
//    return sum;
//  }

  @Override
  public Z next() {
    throw new UnimplementedException();
//    final Z unscaled = outerSum(++mN);
//    if (mN > 2) {
//      mF = mF.multiply(mN - 2);
//    }
//    System.out.println(unscaled + "/" + mF);
//    return unscaled.divide(mF);
  }
}
