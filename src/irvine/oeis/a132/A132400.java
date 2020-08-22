package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132400 Period 4: repeat [1, 5, 3, 1].
 * @author Sean A. Irvine
 */
public class A132400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132400() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 5, 3, 1});
  }
}
