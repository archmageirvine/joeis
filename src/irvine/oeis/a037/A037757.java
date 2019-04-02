package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037757 Decimal expansion of a(n) is given by the first n terms of the periodic sequence with initial period 2,3,1,0.
 * @author Sean A. Irvine
 */
public class A037757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037757() {
    super(new long[] {-10, 11, -11, 11}, new long[] {2, 23, 231, 2310});
  }
}
