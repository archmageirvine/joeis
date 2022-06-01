package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198307 Moore lower bound on the order of a (7,g)-cage.
 * @author Sean A. Irvine
 */
public class A198307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198307() {
    super(new long[] {-6, 6, 1}, new long[] {8, 14, 50});
  }
}
