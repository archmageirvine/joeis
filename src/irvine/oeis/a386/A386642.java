package irvine.oeis.a386;

import java.util.Arrays;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A386642 allocated for Philip Jameson.
 * @author Sean A. Irvine
 */
public class A386642 extends Sequence1 {

  private int mN = 0;

  private boolean has1(final int[] s) {
    for (final int v : s) {
      if (v == 1) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    final Bumper bumper = BumperFactory.weaklyIncreasing(mN);
    final int[] roll = new int[mN];
    final int[] cntForm = new int[mN + 1];
    Arrays.fill(roll, 1);
    Z cnt = Z.ZERO;
    do {
      // Roll is already inherently sorted, check "1" constraint
      if (roll[roll.length - roll[roll.length - 1]] == 1) {
        // Compute contribution from this pattern of dice
        IntegerPartition.toCountForm(roll, cntForm);
        cnt = cnt.add(Binomial.multinomial(mN, cntForm));
      }
    } while (bumper.bump(roll) && roll[0] == 1);
    return cnt;
  }
}

