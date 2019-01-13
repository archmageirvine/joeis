package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037727.
 * @author Sean A. Irvine
 */
public class A037727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037727() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {2, 16, 131, 1049, 8394});
  }
}
