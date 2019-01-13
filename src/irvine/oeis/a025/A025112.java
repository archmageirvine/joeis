package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025112.
 * @author Sean A. Irvine
 */
public class A025112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025112() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {3, 5, 22, 30, 73, 91, 172});
  }
}
