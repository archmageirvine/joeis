package irvine.oeis.a290;
// manually etman at 2023-02-06 12:43

import irvine.oeis.a000.A000670;
import irvine.oeis.transform.EulerTransform;

/**
 * A290352 Euler transform of the Fubini numbers (ordered Bell numbers, A000670).
 * @author Georg Fischer
 */
public class A290352 extends EulerTransform {

  /** Construct the sequence. */
  public A290352() {
    super(0, new A000670().skip(1), 1);
  }
}
