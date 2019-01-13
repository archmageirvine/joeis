package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002085.
 * @author Sean A. Irvine
 */
public class A002085 extends A002084 {

  @Override
  public Z next() {
    return super.next().makeOdd();
  }
}
