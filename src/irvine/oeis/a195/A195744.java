package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195744 <code>a(n) = 15*2^(n+1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A195744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195744() {
    super(new long[] {-2, 3}, new long[] {31, 61});
  }
}
