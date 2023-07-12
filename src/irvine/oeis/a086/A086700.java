package irvine.oeis.a086;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A086700 Euler phi function applied to the triangular numbers.
 * @author Georg Fischer
 */
public class A086700 extends A000217 {

  /** Construct the sequence. */
  public A086700() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
