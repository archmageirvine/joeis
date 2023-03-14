package irvine.oeis.a093;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007531;

/**
 * A093074 Greatest prime factor of n and its direct neighbors.
 * @author Georg Fischer
 */
public class A093074 extends Sequence1 {

  private int mN = 0;
  private final A007531 mSeq = new A007531();

  {
    mSeq.next();
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.TWO : Jaguar.factor(mSeq.next()).largestPrimeFactor();
  }
}
