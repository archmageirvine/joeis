package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042869 Denominators of continued fraction convergents to <code>sqrt(966)</code>.
 * @author Sean A. Irvine
 */
public class A042869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042869() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 114998, 0, 0, 0, 0, 0}, new long[] {1, 12, 25, 62, 149, 1850, 114849, 1380038, 2874925, 7129888, 17134701, 212746300});
  }
}
