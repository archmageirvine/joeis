package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116785.
 * @author Sean A. Irvine
 */
public class A116785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116785() {
    super(new long[] {-2, 17, -60, 116, -135, 97, -42, 10}, new long[] {1, 2, 6, 21, 71, 222, 652, 1838});
  }
}
