package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001018;

/**
 * A024088 <code>a(n) = 8^n-1</code>.
 * @author Sean A. Irvine
 */
public class A024088 extends A001018 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
