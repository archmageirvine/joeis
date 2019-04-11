package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000773 Number of numbers <code>== 0 (mod 3)</code> in range <code>2^n</code> to <code>2^(n+1)</code> with odd number of 1's in binary expansion.
 * @author Sean A. Irvine
 */
public class A000773 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int delta = (mN & 1) == 0 ? -1 : 1;
    return Z.ONE.shiftLeft(mN).add(delta).subtract(Z.THREE.pow((mN + 1) / 2)).divide(6);
  }
}
