package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042103 Denominators of continued fraction convergents to sqrt(575).
 * @author Sean A. Irvine
 */
public class A042103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042103() {
    super(new long[] {-1, 0, 48, 0}, new long[] {1, 1, 47, 48});
  }
}
