package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291245.
 * @author Sean A. Irvine
 */
public class A291245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291245() {
    super(new long[] {-1, -5, 1, 5}, new long[] {5, 24, 120, 599});
  }
}
