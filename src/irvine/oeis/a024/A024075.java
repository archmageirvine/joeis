package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000420;

/**
 * A024075 <code>a(n) = 7^n-1</code>.
 * @author Sean A. Irvine
 */
public class A024075 extends A000420 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
