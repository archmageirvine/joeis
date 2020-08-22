package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083421 a(n)=2*5^n-2^n.
 * @author Sean A. Irvine
 */
public class A083421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083421() {
    super(new long[] {-10, 7}, new long[] {1, 8});
  }
}
