package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a000.A000312;

/**
 * A064448 a(n) = gcd(n^n, EulerPhi(n^n)).
 * @author Sean A. Irvine
 */
public class A064448 extends Combiner {

  /** Construct the sequence. */
  public A064448() {
    super(new A064447(), new A000312().skip(), Z::gcd);
  }
}
