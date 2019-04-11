package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159964 <code>a(n) = 2^n*(1-n)</code>.
 * @author Sean A. Irvine
 */
public class A159964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159964() {
    super(new long[] {-4, 4}, new long[] {1, 0});
  }
}
