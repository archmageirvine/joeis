package irvine.oeis.a094;
// manually knest/jaguar at 2023-03-12

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007689;

/**
 * A094473 Smallest prime factor of 2^n+3^n.
 * @author Georg Fischer
 */
public class A094473 extends Sequence1 {

  private final A007689 mSeq = new A007689();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).leastPrimeFactor();
  }
}
