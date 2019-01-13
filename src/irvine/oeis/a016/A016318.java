package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016318.
 * @author Sean A. Irvine
 */
public class A016318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016318() {
    super(new long[] {176, -126, 21}, new long[] {1, 21, 315});
  }
}
