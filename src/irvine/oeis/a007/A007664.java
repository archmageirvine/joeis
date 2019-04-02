package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003056;

/**
 * A007664 Reve's puzzle: number of moves needed to solve the Towers of Hanoi puzzle with 4 pegs and n disks, according to the Frame-Stewart algorithm.
 * @author Sean A. Irvine
 */
public class A007664 extends A003056 {

  private Z mSum = null;

  @Override
  public Z next() {
    mSum = mSum == null ? Z.ZERO : mSum.add(Z.ONE.shiftLeft(super.next().intValueExact()));
    return mSum;
  }
}
