package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086575 <code>a(n) =</code> k where R(k+4)=4.
 * @author Sean A. Irvine
 */
public class A086575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086575() {
    super(new long[] {-10, 11}, new long[] {0, 36});
  }
}
