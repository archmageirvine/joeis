package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182191.
 * @author Sean A. Irvine
 */
public class A182191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182191() {
    super(new long[] {1, -7, 7}, new long[] {-1, 5, 43});
  }
}
