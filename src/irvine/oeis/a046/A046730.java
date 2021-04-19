package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002172;

/**
 * A046730 a(n) = A002172(n) / 2.
 * @author Sean A. Irvine
 */
public class A046730 extends A002172 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
