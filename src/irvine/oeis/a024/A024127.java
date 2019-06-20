package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001020;

/**
 * A024127 <code>a(n) = 11^n-1</code>.
 * @author Sean A. Irvine
 */
public class A024127 extends A001020 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
