package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002548.
 * @author Sean A. Irvine
 */
public class A002548 extends A002547 {

  @Override
  public Z next() {
    return step().den();
  }
}
