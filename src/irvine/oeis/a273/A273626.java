package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273626.
 * @author Sean A. Irvine
 */
public class A273626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273626() {
    super(new long[] {-1, 40, -206, 40}, new long[] {1, 30, 995, 33660});
  }
}
