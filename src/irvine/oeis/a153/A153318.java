package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153318 Numerators of continued fraction convergents to sqrt(6/5).
 * @author Sean A. Irvine
 */
public class A153318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153318() {
    super(new long[] {-1, 0, 22, 0}, new long[] {1, 11, 23, 241});
  }
}
