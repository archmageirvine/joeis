package irvine.oeis.a002;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002856 Number of polyhedra with n nodes and n faces.
 * @author Sean A. Irvine
 */
public class A002856 extends AbstractSequence {

  /* Construct the sequence. */
  public A002856() {
    super(4);
  }

  private int mN = 3;
  private final Plantri mPlantri = new Plantri();

  @Override
  public Z next() {
    mPlantri.count(++mN, -1, -1, -1, false, true, false, false);
    return Z.valueOf(mPlantri.getEdgeCounts()[2 * mN - 2]);
  }

}

