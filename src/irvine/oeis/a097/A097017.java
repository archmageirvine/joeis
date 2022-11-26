package irvine.oeis.a097;
// manually A144613/parm2 at 2022-11-25 11:43

import irvine.math.z.Z;
import irvine.oeis.a144.A144613;

/**
 * A097017 a(n) = sigma(5*n) modulo 6.
 * @author Georg Fischer
 */
public class A097017 extends A144613 {

  /** Construct the sequence. */
  public A097017() {
    super(5);
  }

  @Override
  public Z next() {
    return super.next().mod(Z.SIX);
  }
}
