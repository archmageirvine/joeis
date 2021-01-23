package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076140 Triangular numbers T(k) that are three times another triangular number: T(k) such that T(k) = 3*T(m) for some m.
 * @author Sean A. Irvine
 */
public class A076140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076140() {
    super(new long[] {1, -15, 15}, new long[] {0, 3, 45});
  }
}
