package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A085784 Product of a prime and any number of triangular numbers.
 * @author Sean A. Irvine
 */
public class A085784 extends TwoParameterFormSequence {

  private static final DirectSequence A085782 = DirectSequence.create(new A085782().skip());

  /** Construct the sequence. */
  public A085784() {
    super(1, 1, 1, (j, k) -> Functions.PRIME.z(j).multiply(A085782.a(k)));
  }
}
