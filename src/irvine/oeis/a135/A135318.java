package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135318.
 * @author Sean A. Irvine
 */
public class A135318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135318() {
    super(new long[] {2, 0, 1, 0}, new long[] {1, 1, 1, 2});
  }
}
