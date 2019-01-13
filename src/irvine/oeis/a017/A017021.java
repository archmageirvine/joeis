package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017021.
 * @author Sean A. Irvine
 */
public class A017021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017021() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {243, 100000, 1419857, 7962624, 28629151, 79235168});
  }
}
