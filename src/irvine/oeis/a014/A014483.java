package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014483 Expansion of <code>(1+2*x) / (1-2*x)^4</code>.
 * @author Sean A. Irvine
 */
public class A014483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014483() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 10, 56, 240});
  }
}
