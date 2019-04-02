package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002085 From the expansion of sinh x / cos x: a(n) = odd part of A002084(n).
 * @author Sean A. Irvine
 */
public class A002085 extends A002084 {

  @Override
  public Z next() {
    return super.next().makeOdd();
  }
}
