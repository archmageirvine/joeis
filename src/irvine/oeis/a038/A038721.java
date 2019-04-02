package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038721 k=2 column of A038719.
 * @author Sean A. Irvine
 */
public class A038721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038721() {
    super(new long[] {24, -26, 9}, new long[] {2, 18, 110});
  }
}
