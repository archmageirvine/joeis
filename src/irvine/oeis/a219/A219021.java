package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219021.
 * @author Sean A. Irvine
 */
public class A219021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219021() {
    super(new long[] {1, -19, 76, -76, 19}, new long[] {1, 13, 172, 2356, 32661});
  }
}
