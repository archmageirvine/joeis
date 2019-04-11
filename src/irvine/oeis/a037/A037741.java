package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037741 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,1,3,0</code>.
 * @author Sean A. Irvine
 */
public class A037741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037741() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {2, 17, 139, 1112, 8898});
  }
}
