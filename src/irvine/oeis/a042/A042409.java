package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042409 Denominators of continued fraction convergents to <code>sqrt(732)</code>.
 * @author Sean A. Irvine
 */
public class A042409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042409() {
    super(new long[] {-1, 0, 974, 0}, new long[] {1, 18, 973, 17532});
  }
}
