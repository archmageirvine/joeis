package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001060 a(n) = a(n-1) + a(n-2) with a(0)=2, a(1)=5. Sometimes called the Evangelist Sequence.
 * @author Sean A. Irvine
 */
public class A001060 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
