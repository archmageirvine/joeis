package irvine.oeis.a061;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000005;
import irvine.oeis.a048.A048691;

/**
 * A061680 a(n) = gcd(d(n^2), d(n)).
 * @author Sean A. Irvine
 */
public class A061680 extends Combiner {

  /** Construct the sequence. */
  public A061680() {
    super(new A000005(), new A048691(), GCD);
  }
}
