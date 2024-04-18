package irvine.oeis.a070;
// manually

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000056;

/**
 * A070732 Size of largest conjugacy class in the group GL(2,Z_n).
 * a(n) = A000056(n)/A000010(2*n)
 * @author Georg Fischer
 */
public class A070732 extends A000056 {

  protected long mN = 0;
  
  @Override
  public Z next() {
    ++mN;
    return super.next().divide(Functions.PHI.l(2 * mN));
  }
}
