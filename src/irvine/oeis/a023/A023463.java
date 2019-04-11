package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023463 <code>n-21</code>.
 * @author Sean A. Irvine
 */
public class A023463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023463() {
    super(new long[] {-1, 2}, new long[] {-21, -20});
  }
}
