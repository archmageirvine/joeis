package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168326 <code>a(n) = (6*n - 3*(-1)^n - 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A168326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168326() {
    super(new long[] {-1, 1, 1}, new long[] {4, 4, 10});
  }
}
