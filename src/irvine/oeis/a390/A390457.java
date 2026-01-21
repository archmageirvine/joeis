package irvine.oeis.a390;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390457 allocated for Jesus Pineiro Sanchez.
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
