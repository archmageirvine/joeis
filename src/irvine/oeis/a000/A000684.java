package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000684.
 * @author Sean A. Irvine
 */
public class A000684 extends A000683 {

  @Override
  public Z next() {
    return super.next().multiply2().add(1);
  }
}
