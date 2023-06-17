package irvine.oeis.a253;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A253882 Number of 3-connected planar triangulations of the sphere with n vertices up to orientation preserving isomorphisms.
 * @author Sean A. Irvine
 */
public class A253882 extends AbstractSequence {

  /* Construct the sequence. */
  public A253882() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(new Plantri().count(++mN, -1, -1, -1, true, false, false, false));
  }

}

