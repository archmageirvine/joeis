package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001019;

/**
 * A024102 <code>9^n-n</code>.
 * @author Sean A. Irvine
 */
public class A024102 extends A001019 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
