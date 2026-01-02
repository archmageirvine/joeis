package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391537 Guaranteed win if opponent chooses one of two baskets and the player chooses the coins with values from 1 to n (see Comments for details).
 * @author Sean A. Irvine
 */
public class A391537 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN * ++mN / 4 + mN);
  }
}
