package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Combiner;
import irvine.oeis.a048.A048855;
import irvine.oeis.a217.A217863;

/**
 * A064449 a(n) = gcd(Phi(n!), Phi(n^n), Phi(lcm(1..n)).
 * @author Sean A. Irvine
 */
public class A064449 extends Combiner {

  /** Construct the sequence. */
  public A064449() {
    super(1, new Combiner(new A064447(), new A048855().skip(), Z::gcd), new A217863(), Z::gcd);
  }
}
