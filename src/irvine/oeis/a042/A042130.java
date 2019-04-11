package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042130 Numerators of continued fraction convergents to <code>sqrt(590)</code>.
 * @author Sean A. Irvine
 */
public class A042130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042130() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 11562, 0, 0, 0, 0, 0}, new long[] {24, 73, 170, 753, 1676, 5781, 279164, 843273, 1965710, 8706113, 19377936, 66839921});
  }
}
