package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049057 First element r of (-1)sigma sociable triple (r,s,t): s=(-1)sigma(r), t=(-1)sigma(s), r=(-1)sigma(t), where if x=Product p(i)^r(i), then (-1)sigma(x)=Product(-1+(Sum p(i)^s(i), s(i)=1 to r(i))).
 * @author Sean A. Irvine
 */
public class A049057 implements Sequence {

  private Z mN = Z.valueOf(19);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Jaguar.factor(mN).sigma(-1);
      final Z t = Jaguar.factor(s).sigma(-1);
      final Z u = Jaguar.factor(t).sigma(-1);
      if (u.equals(mN)) {
        return mN;
      }
    }
  }
}
