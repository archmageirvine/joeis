package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001021;

/**
 * A024141 a(n) = 12^n - n.
 * @author Sean A. Irvine
 */
public class A024141 extends A001021 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
