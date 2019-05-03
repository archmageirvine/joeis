package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128102 Number of <code>2 X 2</code> tiles in all tilings of a <code>4 X n</code> rectangle with <code>1 X 1</code> and <code>2 X 2</code> square tiles.
 * @author Sean A. Irvine
 */
public class A128102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128102() {
    super(new long[] {-4, 12, -1, -16, 2, 4}, new long[] {0, 0, 5, 14, 69, 224});
  }
}
