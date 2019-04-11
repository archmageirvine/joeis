package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017570 <code>a(n) = (12*n + 4)^2</code>.
 * @author Sean A. Irvine
 */
public class A017570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017570() {
    super(new long[] {1, -3, 3}, new long[] {16, 256, 784});
  }
}
