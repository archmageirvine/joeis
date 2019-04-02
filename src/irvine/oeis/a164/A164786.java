package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164786 a(n) = 8^n-7.
 * @author Sean A. Irvine
 */
public class A164786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164786() {
    super(new long[] {-8, 9}, new long[] {1, 57});
  }
}
