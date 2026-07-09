package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A085780.
 * @author Sean A. Irvine
 */
public class A085783 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A085783() {
    super(1, 1, 1, (j, k) -> Functions.PRIME.z(j).multiply(Functions.TRIANGULAR.z(k)));
  }
}
