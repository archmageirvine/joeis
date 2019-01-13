package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016981.
 * @author Sean A. Irvine
 */
public class A016981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016981() {
    super(new long[] {120, -82, 17}, new long[] {1, 17, 207});
  }
}
