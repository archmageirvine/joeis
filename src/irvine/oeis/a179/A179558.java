package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179558 <code>a(1)=10; a(n) = a(n-1)*10 - 5^(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A179558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179558() {
    super(new long[] {-50, 15}, new long[] {10, 99});
  }
}
