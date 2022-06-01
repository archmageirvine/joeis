package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195318 Centered 44-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195318() {
    super(new long[] {1, -3, 3}, new long[] {1, 45, 133});
  }
}
