package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030288.
 * @author Sean A. Irvine
 */
public class A030288 extends A030287 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
