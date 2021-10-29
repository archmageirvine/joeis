package irvine.oeis.a267;
// manually deris 1 A016725 at 2021-10-28 22:51

import irvine.oeis.PrependSequence;
import irvine.oeis.a016.A016725;

/**
 * A267651 Number of ways to write n^2 as a sum of three squares: a(n) = A005875(n^2).
 *
 * @author Georg Fischer
 */
public class A267651 extends PrependSequence {

  /**
   * Construct the sequence.
   */
  public A267651() {
    super(0, new A016725());
    next();
  }
}
