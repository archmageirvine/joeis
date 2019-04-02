package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017452 a(n) = (11*n + 5)^4.
 * @author Sean A. Irvine
 */
public class A017452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017452() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {625, 65536, 531441, 2085136, 5764801});
  }
}
