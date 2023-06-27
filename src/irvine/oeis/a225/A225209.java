package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225209 a(n) = (392*16^n -1620*8^n +1890*4^n -767)/105.
 * @author Sean A. Irvine
 */
public class A225209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225209() {
    super(1, new long[] {-512, 736, -252, 29}, new long[] {1, 249, 8537, 186073});
  }
}
