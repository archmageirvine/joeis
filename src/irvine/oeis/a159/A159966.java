package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159966 <code>Lodumo_4</code> of <code>A102370 (sloping</code> binary numbers).
 * @author Sean A. Irvine
 */
public class A159966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159966() {
    super(new long[] {-1, 2, -2, 2}, new long[] {0, 3, 2, 1});
  }
}
