package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138019 Period 5: repeat <code>1, 1, 0, -1, -1</code>.
 * @author Sean A. Irvine
 */
public class A138019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138019() {
    super(new long[] {-1, -1, -1, -1}, new long[] {1, 1, 0, -1});
  }
}
