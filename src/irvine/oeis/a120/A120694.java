package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120694 Sequence demonstrating the Pythagorean theorem.
 * @author Sean A. Irvine
 */
public class A120694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120694() {
    super(new long[] {-49, 50}, new long[] {1, 25});
  }
}
