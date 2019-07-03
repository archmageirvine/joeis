package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.NRot90CornerCounter;

/**
 * A234007 Free polyominoes with <code>4n</code> squares, having 90 degree rotational symmetry about a square corner, but not having reflectional symmetry on axis that coincides with edges.
 * @author jmason
 */
public class A234007 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    mMax += 4;
    return Z.valueOf(new NRot90CornerCounter(mMax, true, false, false).getCuasym().getCounter(mMax));
  }
}
