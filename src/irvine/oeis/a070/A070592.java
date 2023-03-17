package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000215;

/**
 * A070592 Largest prime factor of the n-th Fermat number F(n) = 2^(2^n) + 1.
 * @author Georg Fischer
 */
public class A070592 extends Sequence0 {

  private final A000215 mSeq = new A000215();

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).largestPrimeFactor();
  }
}
