package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import jmason.poly.Rot180MidSideCounter;

/**
 * A234008 Free polyominoes with 2n squares, having 180-degree rotational symmetry about a square mid-side, but no reflective symmetry.
 * @author jmason
 */
public class A234008 extends Sequence1 {

  private int mMax = 0;

  @Override
  public Z next() {
    mMax += 2;
    return Z.valueOf(new Rot180MidSideCounter(mMax, true, false, false).getCuasym().getCounter(mMax));
  }
}
