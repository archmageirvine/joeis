package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146325 Period <code>3</code>: repeat <code>[1, 4, 1]</code>.
 * @author Sean A. Irvine
 */
public class A146325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146325() {
    super(new long[] {1, 0, 0}, new long[] {1, 4, 1});
  }
}
