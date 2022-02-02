package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a075.A075152;

/**
 * A054434 Number of possible positions in an n X n X n Rubik's cube reachable from the starting position.
 * @author Sean A. Irvine
 */
public class A054434 extends A075152 {

  @Override
  public Z next() {
    return super.next().multiply((mN & 1) == 0 ? 24 : 1);
  }
}
