package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042011 Denominators of continued fraction convergents to <code>sqrt(528)</code>.
 * @author Sean A. Irvine
 */
public class A042011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042011() {
    super(new long[] {-1, 0, 46, 0}, new long[] {1, 1, 45, 46});
  }
}
