package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176563 Period <code>4</code>: repeat <code>[1, -3, 1, 1]</code>.
 * @author Sean A. Irvine
 */
public class A176563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176563() {
    super(new long[] {-1, -1, -1}, new long[] {1, -3, 1});
  }
}
