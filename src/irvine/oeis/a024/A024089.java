package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001018;

/**
 * A024089 a(n) = 8^n - n.
 * @author Sean A. Irvine
 */
public class A024089 extends A001018 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
