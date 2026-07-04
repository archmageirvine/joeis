package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005361;

/**
 * A085651 Index of the first of two successive 2's in A005361.
 * @author Sean A. Irvine
 */
public class A085651 extends Sequence1 {

  private final Sequence mS = new A005361();
  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mS.next();
      if (t.equals(Z.TWO) && mA.equals(Z.TWO)) {
        return Z.valueOf(mN);
      }
    }
  }
}
