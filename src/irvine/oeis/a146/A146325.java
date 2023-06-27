package irvine.oeis.a146;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A146325 Period 3: repeat [1, 4, 1].
 * @author Sean A. Irvine
 */
public class A146325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146325() {
    super(1, new long[] {1, 0, 0}, new long[] {1, 4, 1});
  }
}
