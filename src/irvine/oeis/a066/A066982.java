package irvine.oeis.a066;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A066982 a(n) = Lucas(n+1) - (n+1).
 * @author Sean A. Irvine
 */
public class A066982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066982() {
    super(1, new long[] {1, -1, -2, 3}, new long[] {1, 1, 3, 6});
  }
}
