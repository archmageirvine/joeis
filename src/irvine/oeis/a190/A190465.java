package irvine.oeis.a190;

import irvine.math.function.Functions;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A190465 Numbers with prime factorization p^5q^5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A190465 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A190465() {
    super(1, 1, 2, (p, q) -> p >= q ? null : Functions.PRIME.z(p).pow(5).multiply(Functions.PRIME.z(q).pow(5)));
  }
}
