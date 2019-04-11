package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025879 Expansion of <code>1/((1-x^5)(1-x^6)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A025879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025879() {
    super(new long[] {1, 0, 0, 0, 0, -1, -1, 0, 0, 0, -1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 2, 1, 1, 0, 0, 2, 2, 1, 1, 0, 3});
  }
}
