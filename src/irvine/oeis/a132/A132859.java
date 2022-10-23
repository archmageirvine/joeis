package irvine.oeis.a132;
// manually deris2/essent 0 A049384 at 2021-11-04 15:02
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A132859 a(0)=0, a(n)=n^a(n-1) for n&gt;=1 .
 * @author Georg Fischer
 */
public class A132859 extends Sequence0 {

  private Z mN = Z.ZERO;
  private Z mPrev = Z.ZERO;
 
  @Override
  public Z next() {
    final Z result = mPrev;
    mN = mN.add(1);
    mPrev = mN.pow(result);
    return result;
  }
}
