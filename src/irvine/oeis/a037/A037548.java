package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037548 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,2</code>.
 * @author Sean A. Irvine
 */
public class A037548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037548() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 9, 65, 456});
  }
}
