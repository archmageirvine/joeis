package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120743 <code>a(n) = (1/2)*(1 +</code> 3*i)^n <code>+ (1/2)*(1 -</code> 3*i)^n where i <code>= sqrt(-1)</code>.
 * @author Sean A. Irvine
 */
public class A120743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120743() {
    super(new long[] {-10, 2}, new long[] {1, -8});
  }
}
