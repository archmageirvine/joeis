package irvine.oeis.a233;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A233773 Triangle read by rows in which row n lists the proper divisors of n together with -n.
 * Copied from A027750.
 * @author Georg Fischer
 */
public class A233773 implements Sequence {

  private long mN = 0;
  private Z[] mList = new Z[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mList.length) {
      if (++mN == 1) {
        return Z.NEG_ONE;
      }
      mList = Cheetah.factor(mN).divisorsSorted();
      mM = 0;
    }
    return mList[mM].multiply(mM == mList.length - 1 ? -1 : 1);
  }
}
