package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133848 <code>a(n)*a(n-11) = a(n-1)*a(n-10)+a(n-5)+a(n-6)</code> with initial terms <code>a(1)=</code>...=a(11)=1.
 * @author Sean A. Irvine
 */
public class A133848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133848() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -94, 0, 0, 0, 0, 0, 0, 0, 0, 0, 94, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 5, 7, 9, 11, 15, 23, 35, 51, 71, 239, 411, 587, 767, 951, 1325, 2075, 3201, 4703});
  }
}
