package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.a054.A054353;

/**
 * A088568 3*n - 2*(partial sums of Kolakoski sequence A000002).
 * @author Georg Fischer
 */
public class A088568 extends A054353 {

  private long mN = 0;

  @Override
  public Z next() {
    // a(n) = 3*n - 2*A054353(n) by definition.
    ++mN;
    return super.next().multiply(-2).add(3 * mN);
  }
}
