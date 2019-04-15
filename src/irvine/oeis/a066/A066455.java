package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066455 <code>6*binomial(n,4)+5*binomial(n,2)-4*n+5</code>.
 * @author Sean A. Irvine
 */
public class A066455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066455() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 8, 25, 65});
  }
}
