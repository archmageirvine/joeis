package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094628 Erroneous version of A052218.
 * @author Sean A. Irvine
 */
public class A094628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094628() {
    super(new long[] {10, 0}, new long[] {4, 13});
  }
}
