package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081683 <code>(10^n-9^n-8^n-7^n+4*6^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A081683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081683() {
    super(new long[] {30240, -19524, 5000, -635, 40}, new long[] {1, 5, 25, 140, 1063});
  }
}
