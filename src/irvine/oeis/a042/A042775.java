package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042775 Denominators of continued fraction convergents to sqrt(918).
 * @author Sean A. Irvine
 */
public class A042775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042775() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8241802, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 7, 10, 67, 2020, 12187, 14207, 40601, 136010, 8201201, 24739613, 57680427, 82420040, 552200667, 16648440050L, 100442840967L, 117091281017L, 334625403001L, 1120967490020L});
  }
}
