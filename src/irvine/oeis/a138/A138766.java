package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138766 Real part of upper left and lower right terms of <code>[1</code>,(1+I); <code>1,1]^n * [1,0]</code>.
 * @author Sean A. Irvine
 */
public class A138766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138766() {
    super(new long[] {-1, 0, -4, 4}, new long[] {1, 2, 4, 7});
  }
}
