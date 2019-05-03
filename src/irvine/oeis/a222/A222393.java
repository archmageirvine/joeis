package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222393 Nonnegative integers m such that <code>18*m*(m+1)+1</code> is a square.
 * @author Sean A. Irvine
 */
public class A222393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222393() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {0, 4, 12, 152, 424});
  }
}
