package irvine.oeis.a171;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A171090 Number of Apollonian packings of n circles that are Eulerian and irreducible.
 * @author Sean A. Irvine
 */
public class A171090 extends AbstractSequence {

  /* Construct the sequence. */
  public A171090() {
    super(6);
  }

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

