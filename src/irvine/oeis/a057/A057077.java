package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057077 Periodic sequence 1,1,-1,-1; expansion of (1+x)/(1+x^2).
 * @author Sean A. Irvine
 */
public class A057077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057077() {
    super(new long[] {-1, 0}, new long[] {1, 1});
  }
}
