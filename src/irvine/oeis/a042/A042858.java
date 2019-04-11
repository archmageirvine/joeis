package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042858 Numerators of continued fraction convergents to <code>sqrt(960)</code>.
 * @author Sean A. Irvine
 */
public class A042858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042858() {
    super(new long[] {-1, 0, 62, 0}, new long[] {30, 31, 1890, 1921});
  }
}
