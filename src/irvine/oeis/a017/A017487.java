package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017487.
 * @author Sean A. Irvine
 */
public class A017487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017487() {
    super(new long[] {-1, 4, -6, 4}, new long[] {512, 6859, 27000, 68921});
  }
}
