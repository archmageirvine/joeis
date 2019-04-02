package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179557 a(1)=10; a(n)=a(n-1)*10 -/+ 1 (alternating).
 * @author Sean A. Irvine
 */
public class A179557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179557() {
    super(new long[] {10, 9}, new long[] {10, 99});
  }
}
