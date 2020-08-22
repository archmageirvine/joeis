package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214683 a(n+3) = -a(n+2) + 2a(n+1) + a(n) with a(0)=-1, a(1)=0, a(2)=-3.
 * @author Sean A. Irvine
 */
public class A214683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214683() {
    super(new long[] {1, 2, -1}, new long[] {-1, 0, -3});
  }
}
