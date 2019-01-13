package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134161.
 * @author Sean A. Irvine
 */
public class A134161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134161() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {373, 10363, 61723, 210901, 539041});
  }
}
