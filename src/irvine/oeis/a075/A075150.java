package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075150 <code>a(n)=L(n)*C(n), L(n)=Lucas</code> numbers <code>(A000032), C(n)=reflected</code> Lucas numbers (see comment to <code>A061084)</code>.
 * @author Sean A. Irvine
 */
public class A075150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075150() {
    super(new long[] {1, 2, -2}, new long[] {4, -1, 9});
  }
}
