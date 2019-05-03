package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057078 Periodic sequence 1,0,-1...; expansion of <code>(1+x)/(1+x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A057078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057078() {
    super(new long[] {-1, -1}, new long[] {1, 0});
  }
}
