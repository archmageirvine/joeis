package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042057 Denominators of continued fraction convergents to <code>sqrt(552)</code>.
 * @author Sean A. Irvine
 */
public class A042057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042057() {
    super(new long[] {-1, 0, 94, 0}, new long[] {1, 2, 93, 188});
  }
}
