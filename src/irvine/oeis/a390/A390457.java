package irvine.oeis.a390;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390457 a(1) = 1 thereafter a(n) = floor(k(n)^n) where k(n) = a(1).a(2)a(3)...a(n-1) = 1.111... is the decimal digit concatenation of all preceding terms.
 * @author Sean A. Irvine
 */
public class A390457 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      mS.append('1');
      return Z.ONE;
    } else {
      final Z t = new Q(new Z(mS), Z.TEN.pow(mS.length() - 1)).pow(mN).floor();
      mS.append(t);
      return t;
    }
  }
}
