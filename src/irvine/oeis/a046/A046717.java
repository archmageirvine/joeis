package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046717 a(n) = 2*a(n-1) + 3*a(n-2), a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A046717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046717() {
    super(new long[] {3, 2}, new long[] {1, 1});
  }
}
