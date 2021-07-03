package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048733 a(n) = A048730(n)/4.
 * @author Sean A. Irvine
 */
public class A048733 extends A048730 {

  @Override
  public Z next() {
    return super.next().shiftRight(2);
  }
}
