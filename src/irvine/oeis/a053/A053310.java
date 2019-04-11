package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053310 <code>a(n) =</code> (n+3)*binomial(n+8, <code>8)/3</code>.
 * @author Sean A. Irvine
 */
public class A053310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053310() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 12, 75, 330, 1155, 3432, 9009, 21450, 47190, 97240});
  }
}
