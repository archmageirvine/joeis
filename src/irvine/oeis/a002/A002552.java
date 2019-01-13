package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002552.
 * @author Sean A. Irvine
 */
public class A002552 extends A002551 {

  @Override
  public Z next() {
    return step().den();
  }
}
