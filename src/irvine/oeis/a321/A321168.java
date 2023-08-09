package irvine.oeis.a321;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A321168 Maximum number of squarefree conjugates of a ternary word of length n.
 * @author Georg Fischer
 */
public class A321168 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 5) {
      return Z.THREE;
    }
    if (mN == 7) {
      return Z.FIVE;
    }
    if (mN == 9) {
      return Z.FOUR;
    }
    if (mN == 10) {
      return Z.SIX;
    }
    if (mN == 14) {
      return Z.TEN;
    }
    if (mN == 17) {
      return Z.valueOf(11);
    }
    return Z.valueOf(mN);
  }
}
