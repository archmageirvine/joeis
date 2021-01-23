package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.Rot180MidSideCounter;

/**
 * A234008 Free polyominoes with 2n squares, having 180 degree rotational symmetry about a square mid-side, but not having reflectional symmetry on axis that coincides with edges.
 * @author jmason
 */
public class A234008 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    mMax += 2;
    return Z.valueOf(new Rot180MidSideCounter(mMax, true, false, false).getCuasym().getCounter(mMax));
  }
}
