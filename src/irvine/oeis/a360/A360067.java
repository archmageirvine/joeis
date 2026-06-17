package irvine.oeis.a360;
// manually 2026-06-16

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a089.A089064;

/**
 * A360067 a(n) = det(M) where M is an n X n matrix with M[i,j] = i^j*(i-j).
 * @author Georg Fischer
 */
public class A360067 extends A089064 {

  private long mN = -1;

  /** Construct the sequence. */
  public A360067() {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.SUPERFACTORIAL.z(++mN).multiply(super.next());
  }
}
