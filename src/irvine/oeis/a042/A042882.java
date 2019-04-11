package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042882 Numerators of continued fraction convergents to <code>sqrt(973)</code>.
 * @author Sean A. Irvine
 */
public class A042882 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042882() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 1806446, 0, 0, 0, 0, 0, 0, 0}, new long[] {31, 156, 811, 1778, 15035, 31848, 174275, 903223, 56174101, 281773728, 1465042741, 3211859210L, 27159916421L, 57531692052L, 314818376681L, 1631623575457L});
  }
}
