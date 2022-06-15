package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057543 Maximum cycle length (orbit size) in the rotation permutation of 2n non-crossing handshakes.
 * @author Sean A. Irvine
 */
public class A057543 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    } else if (mN == 2) {
      return Z.TWO;
    } else if (mN == 3) {
      return Z.THREE;
    } else {
      return Z.valueOf(2 * mN);
    }
  }
}
