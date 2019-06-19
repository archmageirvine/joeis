package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000420;

/**
 * A024076 <code>7^n-n</code>.
 * @author Sean A. Irvine
 */
public class A024076 extends A000420 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
