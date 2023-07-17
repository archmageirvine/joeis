package irvine.oeis.a291;

import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A291805 a(n) = phi(A291789(n)).
 * @author Sean A. Irvine
 */
public class A291805 extends A291789 {

  /** Construct the sequence. */
  public A291805() {
    super(1);
  }

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
