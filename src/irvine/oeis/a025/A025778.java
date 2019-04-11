package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025778 Expansion of <code>1/((1-x)(1-x^5)(1-x^8))</code>.
 * @author Sean A. Irvine
 */
public class A025778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025778() {
    super(new long[] {1, -1, 0, 0, 0, -1, 1, 0, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5});
  }
}
