package irvine.oeis.a030;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Polyiamond;
import jmason.poly.PolyiamondCounter;

/**
 * A030223.
 * @author jmason
 */
public class A030223 implements Sequence {

  private int mN = 0;
  private ArrayList<Polyiamond> mPrevList = null;

  @Override
  public Z next() {
    final PolyiamondCounter pc = new PolyiamondCounter(++mN);
    pc.run(true, false, false, mPrevList, true);
    mPrevList = pc.getList();
    long c = 0;
    for (final Polyiamond p : mPrevList) {
      if (p.isBilateralSymmetric()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }    
}
