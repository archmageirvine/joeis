package irvine.oeis.a070;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import jmason.poly.Polyiamond;
import jmason.poly.PolyiamondCounter;

/**
 * A070765 Number of polyiamonds with n cells, without holes.
 * @author Sean A. Irvine
 */
public class A070765 extends Sequence1 {

  private int mN = 0;
  private List<Polyiamond> mPrevList = null;

  @Override
  public Z next() {
    final PolyiamondCounter pc = new PolyiamondCounter(++mN);
    pc.run(true, false, false, mPrevList, true);
    mPrevList = pc.getList();
    long c = 0;
    for (final Polyiamond p : mPrevList) {
      if (!p.isHoly()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }    
}
