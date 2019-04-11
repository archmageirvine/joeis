package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146160 Period 4: repeat <code>[1, 4, 1, 16]</code>.
 * @author Sean A. Irvine
 */
public class A146160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146160() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 4, 1, 16});
  }
}
