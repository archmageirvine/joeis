package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176963 <code>(10*4^n-3*(-4)^n-22)/30</code>.
 * @author Sean A. Irvine
 */
public class A176963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176963() {
    super(new long[] {-16, 16, 1}, new long[] {1, 3, 27});
  }
}
