package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041158 Numerators of continued fraction convergents to <code>sqrt(89)</code>.
 * @author Sean A. Irvine
 */
public class A041158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041158() {
    super(new long[] {1, 0, 0, 0, 0, 1000, 0, 0, 0, 0}, new long[] {9, 19, 66, 217, 500, 9217, 18934, 66019, 216991, 500001});
  }
}
