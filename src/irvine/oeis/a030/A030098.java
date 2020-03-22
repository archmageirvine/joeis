package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030098 Squares whose digits are all even.
 * @author Sean A. Irvine
 */
public class A030098 extends A030097 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
