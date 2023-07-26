package irvine.oeis.a278;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.a001.A001608;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A278248 Least number with the same prime signature as the n-th number in Perrin sequence: a(n) = A046523(A001608(n)), a(1) = 0.
 * @author Georg Fischer
 */
public class A278248 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A278248() {
    super(0, new A001608(), k -> k.isZero() ? Z.ZERO : FactorUtils.leastPrimeSignature(k));
  }
}
