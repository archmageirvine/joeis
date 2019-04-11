package irvine.oeis.a006;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006791 Number of cyclically-5-connected planar trivalent graphs with <code>2n</code> nodes.
 * @author Sean A. Irvine
 */
public class A006791 implements Sequence {

  private int mN = 11;

  @Override
  public Z next() {
    return Z.valueOf(new Plantri().count(++mN, -1, 5, -1, false, false, false, false));
  }
}

