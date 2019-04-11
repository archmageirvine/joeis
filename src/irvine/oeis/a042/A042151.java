package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042151 Denominators of continued fraction convergents to <code>sqrt(600)</code>.
 * @author Sean A. Irvine
 */
public class A042151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042151() {
    super(new long[] {-1, 0, 98, 0}, new long[] {1, 2, 97, 196});
  }
}
