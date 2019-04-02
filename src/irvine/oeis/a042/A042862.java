package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042862 Numerators of continued fraction convergents to sqrt(963).
 * @author Sean A. Irvine
 */
public class A042862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042862() {
    super(new long[] {-1, 0, 1924, 0}, new long[] {31, 962, 59675, 1850887});
  }
}
