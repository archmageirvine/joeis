package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195149 Concentric 22-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195149() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 22, 45});
  }
}
