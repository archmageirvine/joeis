package irvine.oeis.a080;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A080738 Array read by rows in which 0th row is <code>{1,2}</code>; for <code>n&gt;0,</code> n-th row gives finite orders of <code>2n</code> X <code>2n</code> integer matrices that are not orders of <code>2n-1</code> X <code>2n-1</code> integer matrices.
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
