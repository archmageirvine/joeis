package irvine.oeis.a328;
// manually knest/jaguar at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000096;

/**
 * A328827 a(n) is the largest prime factor of n + n*(n+1)/2 = n*(n+3)/2.
 * @author Georg Fischer
 */
public class A328827 extends Sequence1 {

  private final A000096 mSeq = new A000096();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).largestPrimeFactor();
  }
}
