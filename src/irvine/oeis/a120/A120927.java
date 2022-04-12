package irvine.oeis.a120;

import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A120927 a(n) = floor(semiprime(n)/n).
 * @author Georg Fischer
 */
public class A120927 extends A001358 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.next().divide(mN);
  }
}
