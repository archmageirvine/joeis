package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A079026 Numbers that can be represented as 2*p + 3*q, where p and q are prime.
 * @author Sean A. Irvine
 */
public class A079026 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A079026() {
    super(1, 1, 1, (j, k) -> Functions.PRIME.z(j).multiply2().add(Functions.PRIME.z(k).multiply(3)));
  }
}
