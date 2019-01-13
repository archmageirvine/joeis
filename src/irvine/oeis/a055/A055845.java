package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055845.
 * @author Sean A. Irvine
 */
public class A055845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055845() {
    super(new long[] {-1, 4}, new long[] {1, 8});
  }
}
