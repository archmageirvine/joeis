package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095807 Number of integers from 0 to <code>10^n-1</code> which contain at least one decimal digit <code>= 0</code>.
 * @author Sean A. Irvine
 */
public class A095807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095807() {
    super(new long[] {90, -109, 20}, new long[] {1, 10, 181});
  }
}
