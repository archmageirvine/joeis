package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177002 Period <code>4</code>: repeat <code>[1, 2, 4, 2]</code>.
 * @author Sean A. Irvine
 */
public class A177002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177002() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 2, 4, 2});
  }
}
