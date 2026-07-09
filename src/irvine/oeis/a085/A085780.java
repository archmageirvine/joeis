package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A085780 Numbers that are a product of 2 triangular numbers.
 * @author Sean A. Irvine
 */
public class A085780 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A085780() {
    super(1, 0, 1, (j, k) -> (j > 0 || k == 1) && j <= k ? Functions.TRIANGULAR.z(j).multiply(Functions.TRIANGULAR.z(k)) : null);
  }
}
