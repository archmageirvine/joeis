package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079558 a(1)=1; a(n)=LookAndSay(a(n-1)^2) if n&gt;1.
 * @author Sean A. Irvine
 */
public class A079558 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Functions.LOOK_AND_SAY.z(mA.square());
    return mA;
  }
}
