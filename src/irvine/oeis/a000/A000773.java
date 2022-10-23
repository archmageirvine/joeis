package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000773 Number of numbers == 0 (mod 3) in range 2^n to 2^(n+1) with odd number of 1's in binary expansion.
 * @author Sean A. Irvine
 */
public class A000773 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int delta = (mN & 1) == 0 ? -1 : 1;
    return Z.ONE.shiftLeft(mN).add(delta).subtract(Z.THREE.pow((mN + 1) / 2)).divide(6);
  }
}
