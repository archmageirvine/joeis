package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062075 <code>a(n) = n^4 * 4^n</code>.
 * @author Sean A. Irvine
 */
public class A062075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062075() {
    super(new long[] {1024, -1280, 640, -160, 20}, new long[] {0, 4, 256, 5184, 65536});
  }
}
