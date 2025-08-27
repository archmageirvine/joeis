package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079783 Sum of n-th row of triangle in A079784.
 * @author Sean A. Irvine
 */
public class A079783 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A079783() {
    super(1, new A079782(), (n, k) -> k.multiply(n).subtract(Functions.TRIANGULAR.z(n - 1)));
  }
}

