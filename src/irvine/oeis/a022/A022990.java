package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022990 <code>34-n</code>.
 * @author Sean A. Irvine
 */
public class A022990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022990() {
    super(new long[] {-1, 2}, new long[] {34, 33});
  }
}
