package irvine.oeis.a058;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A058789 Number of polyhedra with n faces and n+1 vertices (or n vertices and n+1 faces).
 * @author Sean A. Irvine
 */
public class A058789 extends AbstractSequence {

  /** Construct the sequence. */
  public A058789() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    final Plantri plantri = new Plantri();
    plantri.count(mN, -1, -1, -1, false, true, false, false);
    return Z.valueOf(plantri.getEdgeCounts()[2 * mN - 1]);
  }
}

