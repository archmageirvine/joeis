package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094002 a(n+3) = 3*a(n+2) - 2*a(n+1) + 1 with a(0)=1, a(1)=5.
 * @author Sean A. Irvine
 */
public class A094002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094002() {
    super(new long[] {2, -5, 4}, new long[] {1, 5, 14});
  }
}
