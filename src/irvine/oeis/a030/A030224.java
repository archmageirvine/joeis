package irvine.oeis.a030;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import jmason.poly.Polyiamond;
import jmason.poly.PolyiamondCounter;

/**
 * A030224 Triangular polyominoes (n-iamonds) without bilateral symmetry (holes are allowed).
 * @author Sean A. Irvine
 */
public class A030224 extends Sequence1 {

  private int mN = 0;
  private List<Polyiamond> mPrevList = null;

  @Override
  public Z next() {
    final PolyiamondCounter pc = new PolyiamondCounter(++mN);
    pc.run(true, false, false, mPrevList, true);
    mPrevList = pc.getList();
    long c = 0;
    for (final Polyiamond p : mPrevList) {
      if (!p.isBilateralSymmetric()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }    
}
