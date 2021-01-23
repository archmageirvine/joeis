package irvine.oeis.a006;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Polyiamond;
import jmason.poly.PolyiamondCounter;

/**
 * A006534 Number of one-sided triangular polyominoes (n-iamonds) with n cells; turning over not allowed, holes are allowed.
 * @author jmason
 */
public class A006534 implements Sequence {

  private int mN = 0;
  private List<Polyiamond> mPrevList = null;

  @Override
  public Z next() {
    final PolyiamondCounter pc = new PolyiamondCounter(++mN);
    pc.run(false, false, true, mPrevList, true);
    mPrevList = pc.getList();
    return Z.valueOf(pc.getCu().getCounter(mN));
  }
}
