package irvine.oeis.a341;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;
import irvine.oeis.a120.A120963;

/**
 * A341710 a(n) = A120963(n)/2.
 * @author Georg Fischer
 */
public class A341710 extends A120963 {

  /** Construct the sequence. */
  public A341710() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
