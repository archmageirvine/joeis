package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042201 Denominators of continued fraction convergents to sqrt(626).
 * @author Sean A. Irvine
 */
public class A042201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042201() {
    super(new long[] {1, 50}, new long[] {1, 50});
  }
}
