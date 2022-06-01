package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219615 a(n) = Sum_{k=0..12} binomial(n,k).
 * @author Sean A. Irvine
 */
public class A219615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219615() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096});
  }
}
