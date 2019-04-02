package irvine.oeis.a080;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A080738 Array read by rows in which 0th row is {1,2}; for n&gt;0, n-th row gives finite orders of 2n X 2n integer matrices that are not orders of 2n-1 X 2n-1 integer matrices.
 * @author Sean A. Irvine
 */
public class A080738 implements Sequence {

  private int mN = 0;
  private int mM = -1;
  private final ArrayList<Z> mList = new ArrayList<>();

  {
    mList.add(Z.ONE);
    mList.add(Z.TWO);
  }

  @Override
  public Z next() {
    if (++mM >= mList.size()) {
      ++mN;
      mList.clear();
      mM = 0;
      final A080737 seq = new A080737();
      final Z n = Z.valueOf(2 * mN);
      final Z limit = Z.ONE.shiftLeft(mN + 2);
      for (Z k = Z.ONE; k.compareTo(limit) < 0; k = k.add(1)) {
        if (n.equals(seq.next())) {
          mList.add(k);
        }
      }
    }
    return mList.get(mM);
  }
}
