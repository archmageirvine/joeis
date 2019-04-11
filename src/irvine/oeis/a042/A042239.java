package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042239 Denominators of continued fraction convergents to <code>sqrt(645)</code>.
 * @author Sean A. Irvine
 */
public class A042239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042239() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2048002, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 63, 635, 7683, 8318, 16001, 40320, 2032001, 4104322, 6136323, 10240645, 129024063, 1300481275, 15734799363L, 17035280638L, 32770080001L, 82575440640L});
  }
}
