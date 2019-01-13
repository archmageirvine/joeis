package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016792.
 * @author Sean A. Irvine
 */
public class A016792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016792() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 625, 4096, 14641, 38416});
  }
}
