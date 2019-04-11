package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159007 Numbers k such that <code>k == 32</code> or <code>41 (mod 73)</code>.
 * @author Sean A. Irvine
 */
public class A159007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159007() {
    super(new long[] {-1, 1, 1}, new long[] {32, 41, 105});
  }
}
