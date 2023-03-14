package irvine.oeis.a350;
// manually knest/jaguar at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;
import irvine.oeis.a098.A098105;

/**
 * A350964 a(n) is the largest prime factor of 2^p - p^2 where p is the n-th prime.
 * @author Georg Fischer
 */
public class A350964 extends Sequence3 {

  private final A098105 mSeq = new A098105();

  {
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).largestPrimeFactor();
  }
}
