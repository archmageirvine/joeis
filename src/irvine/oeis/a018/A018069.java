package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018069 Expansion of 1/((1-3*x)*(1-8*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A018069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018069() {
    super(new long[] {240, -134, 21}, new long[] {1, 21, 307});
  }
}
