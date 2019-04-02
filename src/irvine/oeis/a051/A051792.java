package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051792 a(n)=(-1)^(n-1)*a(n-1)+(-1)^(n-2)*a(n-2), a(1)=1,a(2)=1.
 * @author Sean A. Irvine
 */
public class A051792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051792() {
    super(new long[] {1, 0, -1, 0}, new long[] {1, 1, 0, 1});
  }
}
