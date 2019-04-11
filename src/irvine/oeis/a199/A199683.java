package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199683 <code>3*10^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199683() {
    super(new long[] {-10, 11}, new long[] {4, 31});
  }
}
