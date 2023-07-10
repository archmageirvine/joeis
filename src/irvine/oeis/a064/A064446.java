package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000312;
import irvine.oeis.a003.A003418;

/**
 * A064446 a(n) = gcd(n!, n^n, lcm(1, 2, ..., n)), or gcd(n^n, lcm(1, 2, ..., n)).
 * @author Sean A. Irvine
 */
public class A064446 extends Combiner {

  /** Construct the sequence. */
  public A064446() {
    super(new A003418(), new A000312(), Z::gcd);
    next();
  }
}
