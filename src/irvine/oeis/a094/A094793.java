package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094793 <code>a(n) =</code> (1/n!)*A001688(n).
 * @author Sean A. Irvine
 */
public class A094793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094793() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {9, 53, 181, 465, 1001});
  }
}
