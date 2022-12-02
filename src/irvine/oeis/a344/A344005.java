package irvine.oeis.a344;

import irvine.math.z.Z;
import irvine.oeis.a182.A182665;

/**
 * A344005 a(n) = smallest positive m such that n divides the oblong number m*(m+1).
 * @author Georg Fischer
 */
public class A344005 extends A182665 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.next().negate().add(mN);
  }
}
