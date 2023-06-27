package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198310 Moore lower bound on the order of a (10,g)-cage.
 * @author Sean A. Irvine
 */
public class A198310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198310() {
    super(3, new long[] {-9, 9, 1}, new long[] {11, 20, 101});
  }
}
