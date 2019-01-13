package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193127.
 * @author Sean A. Irvine
 */
public class A193127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193127() {
    super(new long[] {-1, 16, -80, 130, -80, 16}, new long[] {2, 36, 384, 3528, 30250, 248832});
  }
}
