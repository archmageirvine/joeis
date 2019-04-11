package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049683 <code>a(n) =</code> (L(6*n) <code>- 2)/16,</code> where L = A000032 (the Lucas numbers).
 * @author Sean A. Irvine
 */
public class A049683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049683() {
    super(new long[] {1, -19, 19}, new long[] {0, 1, 20});
  }
}
