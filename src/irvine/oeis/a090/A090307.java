package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090307 a(n) = 18*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 18.
 * @author Sean A. Irvine
 */
public class A090307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090307() {
    super(new long[] {1, 18}, new long[] {2, 18});
  }
}
