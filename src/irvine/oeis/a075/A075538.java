package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075538 a(1)=1, a(2)=2, then use "merge and minus": a(n)=merge(a(1),...,a(n-1))-a(1)-...-a(n-1).
 * @author Sean A. Irvine
 */
public class A075538 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    if (mA.length() <= 1) {
      if (mA.length() == 0) {
        mA.append('1');
        return Z.ONE;
      }
      mA.append('2');
      return Z.TWO;
    }
    final Z t = new Z(mA.toString()).subtract(mB);
    mA.append(t);
    mB = mB.add(t);
    return t;
  }
}

