package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224785.
 * @author Sean A. Irvine
 */
public class A224785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224785() {
    super(new long[] {-3, 0, 4, 0}, new long[] {1, 4, 12, 15});
  }
}
