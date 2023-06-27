package irvine.oeis.a222;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A222393 Nonnegative integers m such that 18*m*(m+1)+1 is a square.
 * @author Sean A. Irvine
 */
public class A222393 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222393() {
    super(1, new long[] {1, -1, -34, 34, 1}, new long[] {0, 4, 12, 152, 424});
  }
}
