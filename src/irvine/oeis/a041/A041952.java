package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041952 Numerators of continued fraction convergents to <code>sqrt(499)</code>.
 * @author Sean A. Irvine
 */
public class A041952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041952() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 8980, 0, 0, 0, 0, 0}, new long[] {22, 45, 67, 1452, 1519, 4490, 199079, 402648, 601727, 13038915, 13640642, 40320199});
  }
}
