package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A001358 Semiprimes (or biprimes): products of two primes.
 * @author Sean A. Irvine
 */
public class A001358 extends TwoParameterFormSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001358(final int offset) {
    super(offset, 1, 1, (a, b) -> a <= b ? Functions.PRIME.z(a).multiply(Functions.PRIME.z(b)) : null);
  }

  /** Construct the sequence. */
  public A001358() {
    this(1);
  }
}
