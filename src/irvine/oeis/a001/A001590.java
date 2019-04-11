package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001590 Tribonacci numbers: <code>a(n) = a(n-1) + a(n-2) + a(n-3)</code> with <code>a(0)=0, a(1)=1, a(2)=0</code>.
 * @author Sean A. Irvine
 */
public class A001590 implements Sequence {

  private Z mA = Z.NEG_ONE;
  private Z mB = Z.TWO;
  private Z mC = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB).add(mC);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
