package irvine.oeis.a000;

import java.io.Serializable;
import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000620.
 * @author Sean A. Irvine
 */
public class A000620 implements Sequence, Serializable {

  protected int mN = 0;
  private final ArrayList<Z> mAn = new ArrayList<>();
  private final ArrayList<Z> mAs = new ArrayList<>();
  protected final ArrayList<Z> mPn = new ArrayList<>();
  private final ArrayList<Z> mPs = new ArrayList<>();
  private final ArrayList<Z> mSn = new ArrayList<>();
  protected final ArrayList<Z> mSs = new ArrayList<>();
  protected final ArrayList<Z> mTn = new ArrayList<>();
  protected final ArrayList<Z> mTs = new ArrayList<>();
  protected final ArrayList<Z> mT = new ArrayList<>();

  {
    mAn.add(null);
    mAs.add(null);
    mPn.add(null);
    mPs.add(null);
    mSn.add(null);
    mSs.add(null);
    mTn.add(null);
    mTs.add(null);
    mT.add(Z.ONE);

    mPs.add(Z.ZERO);
    mPs.add(Z.ZERO);
    mPs.add(Z.ZERO);
    mAs.add(Z.ZERO);
    mAs.add(Z.ZERO);
    mAs.add(Z.ZERO);
    mTs.add(Z.ZERO);
    mTs.add(Z.ZERO);
    mTs.add(Z.ZERO);
    mTn.add(Z.ZERO);
    mTn.add(Z.ZERO);
    mTn.add(Z.ZERO);
    mSs.add(Z.ZERO);
    mSs.add(Z.ZERO);
    mSs.add(Z.ZERO);
    mSn.add(Z.ZERO);
    mSn.add(Z.ZERO);
    mSn.add(Z.ONE);
    mPn.add(Z.ONE);
    mPn.add(Z.ONE);
    mPn.add(Z.ONE);
    mAn.add(Z.ONE);
    mAn.add(Z.ONE);
    mAn.add(Z.TWO);
    mT.add(Z.ONE);
    mT.add(Z.ONE);
    mT.add(Z.TWO);
  }

  private Z t1sum() {
    Z t = Z.ZERO;
    for (int j = 1; j <= (mN - 2) / 2; ++j) {
      t = t.add(mT.get(j).multiply(mT.get(mN - 1 - j)));
    }
    t = t.multiply2();
    if ((mN & 1) == 1) {
      final int i = mN / 2;
      t = t.add(mT.get(i).square()).subtract(mAn.get(i));
    }
    return t;
  }

  private Z t3sum() {
    Z t = Z.ZERO;
    for (int i = 1; i <= (mN - 1) / 3; ++i) {
      for (int j = i + 1; j <= (mN - 2) / 2; ++j) {
        final int k = mN - 1 - i - j;
        if (j < k) {
          t = t.add(mT.get(i).multiply(mT.get(j)).multiply(mT.get(k)));
        }
      }
    }
    return t.multiply2();
  }

  @Override
  public Z next() {
    if (++mN >= mPs.size()) {
      mPs.add(mAs.get(mN - 1));
      mPn.add(mAn.get(mN - 1));
      mSs.add(t1sum());
      mSn.add((mN & 1) == 1 ? mAn.get(mN / 2) : Z.ZERO);
      final Z t3 = t3sum();
      Z t4 = Z.ZERO;
      Z t5 = Z.ZERO;
      for (int i = 1; i <= (mN - 2) / 2; ++i) {
        final int j = mN - 1 - 2 * i;
        if (j > 0 && i != j) {
          t4 = t4.add(mT.get(i).square().subtract(mAn.get(i)).multiply(mT.get(j))
                      .add(mAn.get(i).multiply(mAs.get(j))));
          t5 = t5.add(mAn.get(i).multiply(mAn.get(j)));
        }
      }
      final Z t6;
      final Z t7;
      if (mN % 3 == 1) {
        final int i = mN / 3;
        t7 = mAn.get(i).square();
        t6 = Z.TWO.multiply(mT.get(i)).add(mT.get(i).pow(3)).divide(3).subtract(t7);
      } else {
        t6 = Z.ZERO;
        t7 = Z.ZERO;
      }
      mTs.add(t3.add(t4).add(t6));
      mTn.add(t5.add(t7));
      mAs.add(mPs.get(mN).add(mSs.get(mN)).add(mTs.get(mN)));
      mAn.add(mPn.get(mN).add(mSn.get(mN)).add(mTn.get(mN)));
      mT.add(mAs.get(mN).add(mAn.get(mN)));
    }
    return mPs.get(mN);
  }
}

