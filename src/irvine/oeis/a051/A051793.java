package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051793 a(n = sum((-1)^i*a(i), i=n-4..n-1), a(1)=1,a(2)=1,a(3)=1,a(4)=1.
 * @author Sean A. Irvine
 */
public class A051793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051793() {
    super(new long[] {1, 0, 1, 0, -1, 0, -1, 0}, new long[] {1, 1, 1, 1, 0, 1, 1, 1});
  }
}
