package irvine.oeis.a241;

import irvine.math.z.Z;
import irvine.oeis.a057.A057977;

/**
 * A241543 a(n) = A241477(n, n).
 * @author Georg Fischer
 */
public class A241543 extends A057977 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ONE : super.next().multiply2();
  }
}
