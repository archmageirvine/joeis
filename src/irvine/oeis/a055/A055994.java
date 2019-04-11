package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055994 Expansion of <code>(1+6x)/(1-x)^10</code>.
 * @author Sean A. Irvine
 */
public class A055994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055994() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 16, 115, 550, 2035, 6292, 17017, 41470, 92950, 194480});
  }
}
