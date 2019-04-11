package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122769 Numbers k such that <code>k^2</code> is of the form 3*m^2 + 2*m <code>+ 1</code> (A056109).
 * @author Sean A. Irvine
 */
public class A122769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122769() {
    super(new long[] {-1, 14}, new long[] {1, 11});
  }
}
