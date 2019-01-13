package irvine.oeis.a171;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A171090.
 * @author Sean A. Irvine
 */
public class A171090 implements Sequence {

  private int mN = 5;
  private final Plantri mPlantri = new Plantri();
  {
    mPlantri.setBipartite(true);
  }

  @Override
  public Z next() {
    return Z.valueOf(mPlantri.count(++mN, -1, 4, -1, false, false, false, false));
  }
}

