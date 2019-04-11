package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041945 Denominators of continued fraction convergents to <code>sqrt(495)</code>.
 * @author Sean A. Irvine
 */
public class A041945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041945() {
    super(new long[] {-1, 0, 178, 0}, new long[] {1, 4, 177, 712});
  }
}
