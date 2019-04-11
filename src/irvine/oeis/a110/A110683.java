package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110683 Expansion of <code>(7*x^2+3*x-1)*(2*x^2+2*x+1)/((x-1)*(3*x^2+3*x+1)*(2*x^3+2*x^2+4*x+1))</code>.
 * @author Sean A. Irvine
 */
public class A110683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110683() {
    super(new long[] {6, 6, 8, -3, -10, -6}, new long[] {1, -7, 21, -79, 279, -997});
  }
}
