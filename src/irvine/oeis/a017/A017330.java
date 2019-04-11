package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017330 <code>a(n) = (10*n+5)^2</code>.
 * @author Sean A. Irvine
 */
public class A017330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017330() {
    super(new long[] {1, -3, 3}, new long[] {25, 225, 625});
  }
}
