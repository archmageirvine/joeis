package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158879 a(n) = 4^n + n.
 * @author Sean A. Irvine
 */
public class A158879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158879() {
    super(new long[] {4, -9, 6}, new long[] {1, 5, 18});
  }
}
