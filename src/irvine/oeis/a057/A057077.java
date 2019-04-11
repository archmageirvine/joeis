package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057077 Periodic sequence <code>1,1,-1,-1</code>; expansion of <code>(1+x)/(1+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A057077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057077() {
    super(new long[] {-1, 0}, new long[] {1, 1});
  }
}
