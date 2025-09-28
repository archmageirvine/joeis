package irvine.oeis.a179;
// manually 2025-09-28

import irvine.math.function.Functions;
import irvine.oeis.transform.RationalProductTransform;

/**
 * A179381 Row sums of A179318.
 * @author Georg Fischer
 */
public class A179381 extends RationalProductTransform {

  /** Construct the sequence. */
  public A179381() {
    super(1);
    g(k -> Functions.CATALAN.z(k - 1));
    next();
  }
}
