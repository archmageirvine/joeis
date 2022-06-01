package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079979 Characteristic function of multiples of six.
 * @author Sean A. Irvine
 */
public class A079979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079979() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0});
  }
}
