package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289006 Conversion to octal of the binary expansion given by the first n terms of the period-3 sequence A011655 (repeat <code>0, 1, 1)</code>.
 * @author Sean A. Irvine
 */
public class A289006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289006() {
    super(new long[] {-10, 0, 0, 11, 0, 0}, new long[] {0, 1, 3, 6, 15, 33});
  }
}
