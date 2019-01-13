package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257075.
 * @author Sean A. Irvine
 */
public class A257075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257075() {
    super(new long[] {1, 0, 0}, new long[] {1, -1, 1});
  }
}
