package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025991.
 * @author Sean A. Irvine
 */
public class A025991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025991() {
    super(new long[] {-720, 684, -208, 25}, new long[] {1, 25, 417, 5909});
  }
}
