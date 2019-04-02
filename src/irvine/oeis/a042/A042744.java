package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042744 Numerators of continued fraction convergents to sqrt(903).
 * @author Sean A. Irvine
 */
public class A042744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042744() {
    super(new long[] {-1, 0, 1202, 0}, new long[] {30, 601, 36090, 722401});
  }
}
