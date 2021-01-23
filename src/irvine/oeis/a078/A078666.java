package irvine.oeis.a078;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A078666 Number of isomorphism classes of simple quadrangulations of the sphere having n+2 vertices and n faces, minimal degree 3, with orientation-reversing isomorphisms permitted.
 * @author Sean A. Irvine
 */
public class A078666 implements Sequence {

  private int mN = 7;

  @Override
  public Z next() {
    return Z.valueOf(new Plantri().count(++mN, 3, 5, -1, false, false, true, false));
  }
}

