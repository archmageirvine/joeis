package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042583 Denominators of continued fraction convergents to <code>sqrt(820)</code>.
 * @author Sean A. Irvine
 */
public class A042583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042583() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 79378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 8, 11, 118, 129, 376, 505, 881, 1386, 78497, 79883, 158380, 238263, 634906, 873169, 9366596, 10239765, 29846126, 40085891, 69932017, 110017908});
  }
}
