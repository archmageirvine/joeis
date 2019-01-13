package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105843.
 * @author Sean A. Irvine
 */
public class A105843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105843() {
    super(new long[] {-1, 0, 146, 0}, new long[] {1, 149, 295, 21755});
  }
}
