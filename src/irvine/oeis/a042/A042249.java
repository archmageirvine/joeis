package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042249 Denominators of continued fraction convergents to sqrt(650).
 * @author Sean A. Irvine
 */
public class A042249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042249() {
    super(new long[] {-1, 0, 102, 0}, new long[] {1, 2, 101, 204});
  }
}
