package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221011.
 * @author Sean A. Irvine
 */
public class A221011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221011() {
    super(new long[] {128, -288, 232, -86, 15}, new long[] {159, 8934, 138021, 1343571, 10311135});
  }
}
