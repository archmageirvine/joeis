package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021764.
 * @author Sean A. Irvine
 */
public class A021764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021764() {
    super(new long[] {-160, 252, -109, 18}, new long[] {1, 18, 215, 2160});
  }
}
