package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198307 Moore lower bound on the order of a <code>(7,g)-cage</code>.
 * @author Sean A. Irvine
 */
public class A198307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198307() {
    super(new long[] {-6, 6, 1}, new long[] {8, 14, 50});
  }
}
