package irvine.oeis.a002;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002856.
 * @author Sean A. Irvine
 */
public class A002856 implements Sequence {

  private int mN = 3;
  private final Plantri mPlantri = new Plantri();

  @Override
  public Z next() {
    mPlantri.count(++mN, -1, -1, -1, false, true, false, false);
    return Z.valueOf(mPlantri.getEdgeCounts()[2 * mN - 2]);
  }

}

