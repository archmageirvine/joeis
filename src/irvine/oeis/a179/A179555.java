package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179555 a(1)=10; a(n) = a(n-1)*10 - 1.
 * @author Sean A. Irvine
 */
public class A179555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179555() {
    super(new long[] {-10, 11}, new long[] {10, 99});
  }
}
