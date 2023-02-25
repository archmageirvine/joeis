package irvine.oeis.a276;
// manually convprod at 2023-02-24 17:45

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000607;

/**
 * A276560 Expansion of Sum_{k&gt;=1} prime(k)*x^prime(k)/(1 - x^prime(k)) * Product_{k&gt;=1} 1/(1 - x^prime(k)).
 * @author Georg Fischer
 */
public class A276560 extends Sequence1 {

  private int mN = 0;
  private final A000607 mSeq = new A000607();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().multiply(++mN);
  }
}
