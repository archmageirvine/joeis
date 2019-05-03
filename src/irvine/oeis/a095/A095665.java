package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095665 Tenth column <code>(m=9)</code> of <code>(1,3)-Pascal</code> triangle <code>A095660</code>.
 * @author Sean A. Irvine
 */
public class A095665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095665() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {3, 28, 145, 550, 1705, 4576, 11011, 24310, 50050, 97240});
  }
}
