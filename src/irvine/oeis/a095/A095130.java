package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095130 Expansion of <code>(x+x^2)/(1-x^6);</code> period <code>6</code>: repeat <code>[0, 1, 1, 0, 0, 0]</code>.
 * @author Sean A. Irvine
 */
public class A095130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095130() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 1, 1, 0, 0});
  }
}
