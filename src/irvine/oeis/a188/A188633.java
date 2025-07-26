package irvine.oeis.a188;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A188633 Numbers of the form 2^k * m, with k &gt; 1 and m an odd composite number.
 * @author Sean A. Irvine
 */
public class A188633 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A188633() {
    super(1, 4, 2, (m, k) -> Z.valueOf(2 * m + 1).shiftLeft(k));
  }

  @Override
  protected boolean accept(final long m, final long k, final Z n, final Z prev) {
    return !Predicates.PRIME.is(2 * m + 1);
  }
}

