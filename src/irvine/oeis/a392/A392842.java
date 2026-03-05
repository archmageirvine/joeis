package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001906;
import irvine.oeis.a035.A035614;

/**
 * A392842 Number of trailing zeros in a type of Zeckendorf expansion based on Fibonacci numbers of even index.
 * @author Sean A. Irvine
 */
public class A392842 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A035614());
  private final Sequence mF = new A001906().skip(2);
  private int mN = mF.next().intValueExact();
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mN = mF.next().intValueExact();
    }
    return mA.a(mN - mM);
  }
}
