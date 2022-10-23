package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import jmason.poly.PolySideCounter;

/**
 * A075679 Number of free (rotations and reflections count as same shape) polyominoids (shapes made of faces of cubes) with n squares.
 * @author jmason
 */
public class A075679 extends Sequence1 {

  private int mMax = 0;

  @Override
  public Z next() {
    return Z.valueOf(new PolySideCounter(++mMax).getCu().getCounter(mMax));
  }
}
