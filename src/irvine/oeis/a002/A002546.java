package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002546.
 * @author Sean A. Irvine
 */
public class A002546 extends A002545 {

  @Override
  public Z next() {
    return step().den();
  }
}
