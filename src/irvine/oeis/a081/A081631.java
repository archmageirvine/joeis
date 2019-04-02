package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081631 2*2^n-(-2)^n.
 * @author Sean A. Irvine
 */
public class A081631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081631() {
    super(new long[] {4, 0}, new long[] {1, 6});
  }
}
