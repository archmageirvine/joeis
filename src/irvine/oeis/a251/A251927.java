package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251927.
 * @author Sean A. Irvine
 */
public class A251927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251927() {
    super(new long[] {1, -1, 0, -1442, 1442, 0, 1}, new long[] {0, 8, 76, 1518, 12986, 111034, 2190396});
  }
}
