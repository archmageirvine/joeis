package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083223 (5*6^n+(-6)^n)/6.
 * @author Sean A. Irvine
 */
public class A083223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083223() {
    super(new long[] {36, 0}, new long[] {1, 4});
  }
}
