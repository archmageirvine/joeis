package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066375 <code>a(n) =</code> 6*binomial(n,4) + 3*binomial(n,3) + 4*binomial(n,2) <code>- n + 2</code>.
 * @author Sean A. Irvine
 */
public class A066375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066375() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 14, 40, 97});
  }
}
