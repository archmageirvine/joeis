package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275173 <code>a(n) = (a(n-3) + a(n-1) * a(n-5)) / a(n-6), a(0) = a(1) =</code> ... <code>= a(5) = 1</code>.
 * @author Sean A. Irvine
 */
public class A275173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275173() {
    super(new long[] {1, 0, 0, 0, 0, -16, 0, 0, 0, 0, 16, 0, 0, 0, 0}, new long[] {1, 1, 1, 1, 1, 1, 2, 3, 4, 6, 9, 22, 36, 51, 82});
  }
}
