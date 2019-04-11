package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041922 Numerators of continued fraction convergents to <code>sqrt(483)</code>.
 * @author Sean A. Irvine
 */
public class A041922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041922() {
    super(new long[] {-1, 0, 44, 0}, new long[] {21, 22, 945, 967});
  }
}
