package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057079 Periodic sequence: repeat <code>[1,2,1,-1,-2,-1];</code> expansion of <code>(1+x)/(1-x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A057079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057079() {
    super(new long[] {-1, 1}, new long[] {1, 2});
  }
}
