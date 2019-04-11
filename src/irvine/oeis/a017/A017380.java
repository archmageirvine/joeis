package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017380 <code>a(n) = (10*n + 9)^4</code>.
 * @author Sean A. Irvine
 */
public class A017380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017380() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6561, 130321, 707281, 2313441, 5764801});
  }
}
