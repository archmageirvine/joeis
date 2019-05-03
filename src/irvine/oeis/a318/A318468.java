package irvine.oeis.a318;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A318468 <code>a(n) = 2*n</code> AND <code>A000203(n)</code>, where AND is <code>bitwise-and (A004198)</code> and <code>A000203 =</code> sum of divisors.
 * @author Sean A. Irvine
 */
public class A318468 extends A000203 {

  @Override
  public Z next() {
    return super.next().and(Z.valueOf(2 * mN));
  }
}
