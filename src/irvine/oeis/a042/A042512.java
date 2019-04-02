package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042512 Numerators of continued fraction convergents to sqrt(785).
 * @author Sean A. Irvine
 */
public class A042512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042512() {
    super(new long[] {1, 56}, new long[] {28, 1569});
  }
}
