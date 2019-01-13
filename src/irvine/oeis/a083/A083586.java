package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083586.
 * @author Sean A. Irvine
 */
public class A083586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083586() {
    super(new long[] {-36, 69, -43, 11}, new long[] {0, 1, 5, 22});
  }
}
