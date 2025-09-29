package irvine.oeis.a080;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080738 Array read by rows in which 0th row is {1,2}; for n&gt;0, n-th row gives finite orders of 2n X 2n integer matrices that are not orders of 2n-1 X 2n-1 integer matrices.
 * @author Sean A. Irvine
 */
public class A080738 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  protected final ArrayList<Z> mList = new ArrayList<>();

  protected int step() {
    mList.clear();
    mM = 0;
    if (++mN == 0) {
      mList.add(Z.ONE);
      mList.add(Z.TWO);
    } else {
      final A080737 seq = new A080737();
      final Z n = Z.valueOf(2L * mN);
      final Z limit = Z.ONE.shiftLeft(mN + 2);
      for (Z k = Z.ONE; k.compareTo(limit) < 0; k = k.add(1)) {
        if (n.equals(seq.next())) {
          mList.add(k);
        }
      }
    }
    return mList.size();
  }

  @Override
  public Z next() {
    if (++mM >= mList.size()) {
      step();
    }
    return mList.get(mM);
  }
}
