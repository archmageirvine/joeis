package irvine.oeis.a051;

import irvine.oeis.a050.A050875;

/**
 * A051243 Base 3 numbers d(1)...d(j) such that d(i)=d(j+1-i) for all but 2 i.
 * @author Sean A. Irvine
 */
public class A051243 extends A050875 {

  @Override
  protected int target() {
    return 2;
  }

  @Override
  protected int base() {
    return 3;
  }
}
