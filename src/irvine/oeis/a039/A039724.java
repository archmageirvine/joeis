package irvine.oeis.a039;

import irvine.oeis.a007.A007608;

/**
 * A039724 a(n) is the negabinary expansion of n, that is, the expansion of n in base -2.
 * @author Sean A. Irvine
 */
public class A039724 extends A007608 {

  @Override
  protected int base() {
    return -2;
  }
}
