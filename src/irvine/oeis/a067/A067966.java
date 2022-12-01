package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A067966 Number of binary arrangements without adjacent 1's on n X n array connected n-s.
 * @author Georg Fischer
 */
public class A067966 extends A000045 {

  private int mN = -1;

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    // a(n)=fibonacci(n+2)^n
    ++mN;
    return super.next().pow(mN);
  }
}
