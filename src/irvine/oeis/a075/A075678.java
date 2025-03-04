package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import jmason.poly.FixedPolySideCounter;

/**
 * A075678 Number of fixed (orientation matters) polyominoids (shapes made of faces of cubes) with n squares.
 * @author Sean A. Irvine
 */
public class A075678 extends Sequence1 {

  private int mMax = 0;

  @Override
  public Z next() {
    return Z.valueOf(new FixedPolySideCounter(++mMax).getCu().getCounter(mMax));
  }
}
