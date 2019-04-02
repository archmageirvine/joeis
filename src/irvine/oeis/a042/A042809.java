package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042809 Denominators of continued fraction convergents to sqrt(935).
 * @author Sean A. Irvine
 */
public class A042809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042809() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2752, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 7, 19, 26, 45, 2726, 2771, 5497, 13765, 19262, 52289, 71551, 123840});
  }
}
