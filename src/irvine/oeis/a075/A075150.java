package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075150 <code>a(n)=L(n)*C(n)</code>, L(n)=Lucas numbers (A000032), C(n)=reflected Lucas numbers (see comment to A061084).
 * @author Sean A. Irvine
 */
public class A075150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075150() {
    super(new long[] {1, 2, -2}, new long[] {4, -1, 9});
  }
}
