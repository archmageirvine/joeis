package irvine.oeis.a386;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386642 Roll n fair, distinguishable, n-sided dice and sort the dice in increasing order with the lowest on the left, highest on the right. Let m be the maximum value rolled and select the m-th die from the right. Then a(n) is the number of such rolls (over all n^n possible outcomes) where the selected die shows 1.
 * @author Sean A. Irvine
 */
public class A386642 extends Sequence1 {

  // Christian Sievers formula
  // a(n) = 1 + Sum_{k=1..n-1} ( binomial(n,k) * ((n-1)^k-(k-1)^k) )
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> Binomial.binomial(mN + 1, k).multiply(Z.valueOf(mN).pow(k).subtract(Z.valueOf(k - 1).pow(k)))).add(1);
  }

  // Original exhaustive search
//  private int mN = 0;
//
//  private boolean has1(final int[] s) {
//    for (final int v : s) {
//      if (v == 1) {
//        return true;
//      }
//    }
//    return false;
//  }
//
//  @Override
//  public Z next() {
//    ++mN;
//    final Bumper bumper = BumperFactory.weaklyIncreasing(mN);
//    final int[] roll = new int[mN];
//    final int[] cntForm = new int[mN + 1];
//    Arrays.fill(roll, 1);
//    Z cnt = Z.ZERO;
//    do {
//      // Roll is already inherently sorted, check "1" constraint
//      if (roll[roll.length - roll[roll.length - 1]] == 1) {
//        // Compute contribution from this pattern of dice
//        IntegerPartition.toCountForm(roll, cntForm);
//        cnt = cnt.add(Binomial.multinomial(mN, cntForm));
//      }
//    } while (bumper.bump(roll) && roll[0] == 1);
//    return cnt;
//  }
}

