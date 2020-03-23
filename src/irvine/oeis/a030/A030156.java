package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030156 Odd squares in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030156 extends A030155 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
