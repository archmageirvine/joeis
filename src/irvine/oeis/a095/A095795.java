package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095795 a(0)=2, a(1)=5, a(n+2) = a(n+1) + (-1)^n a(n).
 * @author Sean A. Irvine
 */
public class A095795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095795() {
    super(new long[] {1, 0, 1, 0}, new long[] {2, 5, 7, 2});
  }
}
