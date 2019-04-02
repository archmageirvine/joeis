package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042768 Numerators of continued fraction convergents to sqrt(915).
 * @author Sean A. Irvine
 */
public class A042768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042768() {
    super(new long[] {-1, 0, 242, 0}, new long[] {30, 121, 7290, 29281});
  }
}
