package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199314 <code>(11*5^n+1)/4</code>.
 * @author Sean A. Irvine
 */
public class A199314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199314() {
    super(new long[] {-5, 6}, new long[] {3, 14});
  }
}
