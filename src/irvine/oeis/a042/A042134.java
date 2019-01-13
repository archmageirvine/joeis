package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042134.
 * @author Sean A. Irvine
 */
public class A042134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042134() {
    super(new long[] {-1, 0, 146, 0}, new long[] {24, 73, 3528, 10657});
  }
}
