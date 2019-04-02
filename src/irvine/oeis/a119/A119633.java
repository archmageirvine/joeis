package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119633 a(n) = (A046717(n))^3.
 * @author Sean A. Irvine
 */
public class A119633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119633() {
    super(new long[] {-729, -540, 210, 20}, new long[] {1, 125, 2197, 68921});
  }
}
