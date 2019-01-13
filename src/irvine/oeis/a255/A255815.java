package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255815.
 * @author Sean A. Irvine
 */
public class A255815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255815() {
    super(new long[] {5, -5, 6}, new long[] {1, 5, 26});
  }
}
