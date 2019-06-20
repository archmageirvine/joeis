package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001019;

/**
 * A024101 <code>a(n) = 9^n-1</code>.
 * @author Sean A. Irvine
 */
public class A024101 extends A001019 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
