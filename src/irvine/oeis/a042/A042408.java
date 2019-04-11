package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042408 Numerators of continued fraction convergents to <code>sqrt(732)</code>.
 * @author Sean A. Irvine
 */
public class A042408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042408() {
    super(new long[] {-1, 0, 974, 0}, new long[] {27, 487, 26325, 474337});
  }
}
