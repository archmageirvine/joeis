package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041880 Numerators of continued fraction convergents to <code>sqrt(462)</code>.
 * @author Sean A. Irvine
 */
public class A041880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041880() {
    super(new long[] {-1, 0, 86, 0}, new long[] {21, 43, 1827, 3697});
  }
}
