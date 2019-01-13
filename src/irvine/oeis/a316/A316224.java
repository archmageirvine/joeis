package irvine.oeis.a316;

import irvine.oeis.LinearRecurrence;

/**
 * A316224.
 * @author Sean A. Irvine
 */
public class A316224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A316224() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 15, 90, 273});
  }
}
