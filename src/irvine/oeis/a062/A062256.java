package irvine.oeis.a062;

import irvine.oeis.Combiner;
import irvine.oeis.a060.A060424;

/**
 * A062256 Record-setting values of q(n), the minimal prime q such that n(q+1)-1 is a prime p (i.e., q(n) &gt; q(j) for all 0 &lt; j &lt; n).
 * @author Sean A. Irvine
 */
public class A062256 extends Combiner {

  /** Construct the sequence. */
  public A062256() {
    super(1, new A060424(), new A062252(), (a, b) -> a.multiply(b.add(1)).subtract(1));
  }
}
