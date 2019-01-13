package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037785.
 * @author Sean A. Irvine
 */
public class A037785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037785() {
    super(new long[] {-10, 1, 0, 0, 10}, new long[] {3, 31, 312, 3120, 31203});
  }
}
