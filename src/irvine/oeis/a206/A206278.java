package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206278.
 * @author Sean A. Irvine
 */
public class A206278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206278() {
    super(new long[] {512, -64, -160, 20, 8}, new long[] {0, 0, 128, 1024, 6656});
  }
}
