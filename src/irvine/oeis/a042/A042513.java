package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042513 Denominators of continued fraction convergents to <code>sqrt(785)</code>.
 * @author Sean A. Irvine
 */
public class A042513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042513() {
    super(new long[] {1, 56}, new long[] {1, 56});
  }
}
