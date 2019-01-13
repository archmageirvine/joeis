package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037720.
 * @author Sean A. Irvine
 */
public class A037720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037720() {
    super(new long[] {-8, 9, -9, 9}, new long[] {2, 16, 129, 1035});
  }
}
