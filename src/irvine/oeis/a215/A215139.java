package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215139 a(n) = (a(n-1) - a(n-3))*7^((1+(-1)^n)/2) with a(6)=5, a(7)=4, a(8)=22.
 * @author Sean A. Irvine
 */
public class A215139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215139() {
    super(new long[] {7, 0, -14, 0, 7, 0}, new long[] {5, 4, 22, 17, 91, 69});
  }
}
