package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087215 Lucas(6*n): a(n) = 18*a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 18.
 * @author Sean A. Irvine
 */
public class A087215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087215() {
    super(new long[] {-1, 18}, new long[] {2, 18});
  }
}
