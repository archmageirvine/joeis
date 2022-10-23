package irvine.oeis.a058;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058830 Number of labeled n-node 4-valent graphs containing a single double edge.
 * @author Sean A. Irvine
 */
public class A058830 extends Sequence0 {

  private final List<Z> mA = new ArrayList<>();
  private final List<Z> mB = new ArrayList<>();
  protected final List<Z> mC = new ArrayList<>();
  protected final List<Z> mD = new ArrayList<>();
  protected final List<Z> mE = new ArrayList<>();
  protected final List<Z> mF = new ArrayList<>();
  protected final List<Z> mG = new ArrayList<>();
  protected final List<Z> mH = new ArrayList<>();
  protected final List<Z> mI = new ArrayList<>();
  protected int mN = -1;

  protected void step() {
    if (++mN == 0) {
      mA.add(Z.ONE);
      mB.add(Z.ZERO);
      mC.add(Z.ZERO);
      mD.add(Z.ZERO);
      mE.add(Z.ZERO);
      mF.add(Z.ZERO);
      mG.add(Z.ZERO);
      mH.add(Z.ZERO);
      mI.add(Z.ZERO);
    } else {
      mA.add((mA.get(mN - 1).multiply(mN - 1).multiply(2L * mN - 9).add(mB.get(mN - 1).multiply(2L * mN - 8)).add(mC.get(mN - 1))).divide(3));
      mB.add((mA.get(mN - 1).multiply(6L * mN).multiply(mN - 1).add(mB.get(mN - 1).multiply(4L * mN)).add(mD.get(mN - 1).multiply(mN))).divide2());
      mC.add((mB.get(mN - 1).multiply(6L * mN).multiply(mN - 3).add(mC.get(mN - 1).multiply(8L * mN)).add(mD.get(mN - 1).multiply(4L * mN)).add(mE.get(mN - 1).multiply(mN))).divide(4));
      mD.add(mB.get(mN - 1).multiply(mN).add(mF.get(mN - 1).multiply(mN)));
      if (mN > 2) {
        mE.add(mC.get(mN - 1).multiply(4L * mN).add(mD.get(mN - 1).multiply(4L * mN)).add(mG.get(mN - 1).multiply(2L * mN)).add(mA.get(mN - 3).multiply(mN).multiply(mN - 1).multiply(mN - 2)).divide2());
        mF.add(mA.get(mN - 2).multiply(4L * mN - 8).add(mB.get(mN - 2).multiply2()).add(mH.get(mN - 2)).multiply(mN).multiply(mN - 1).divide2());
        mG.add(mB.get(mN - 2).multiply(4L * (mN - 3)).add(mC.get(mN - 2).multiply(4)).add(mD.get(mN - 2).multiply(4)).add(mF.get(mN - 2).multiply2()).add(mI.get(mN - 2)).multiply(mN).multiply(mN - 1).divide2());
      } else {
        mE.add(Z.ZERO);
        mF.add(Z.ZERO);
        mG.add(Z.ZERO);
      }
      mH.add(mA.get(mN - 1).multiply(2L * mN - 2).add(mB.get(mN - 1)).multiply(mN));
      mI.add(mB.get(mN - 1).multiply(2L * mN - 4).add(mC.get(mN - 1).multiply2()).add(mD.get(mN - 1).multiply2()).add(mF.get(mN - 1)).add(mH.get(mN - 1)).multiply(mN));
    }
  }

  @Override
  public Z next() {
    step();
    return mB.get(mN);
  }
}
