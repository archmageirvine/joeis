package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199309 <code>(7*5^n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A199309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199309() {
    super(new long[] {-5, 6}, new long[] {4, 18});
  }
}
