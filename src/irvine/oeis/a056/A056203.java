package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A056203 Triangle of numbers related to congruum problem: T(n,k)=n^2+2nk-k^2 with n&gt;k&gt;0, starting at T(2, 1)=7.
 * @author Georg Fischer
 */
public class A056203 extends Triangle {

  /** Construct the sequence. */
  public A056203() {
    hasRAM(true);
  }

  @Override
  public Z compute(int n, int k) {
    n += 2;
    ++k;
    return Z.valueOf(n).square().add(2 * n * k).subtract(k * k);
  }
}
