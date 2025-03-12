package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001481;
import irvine.oeis.a071.A071383;

/**
 * A075880 Position of the circles around (0,0) that contain record numbers of lattice points in the list of all circles around (0,0) that pass through lattice points, ordered by increasing radius.
 * @author Sean A. Irvine
 */
public class A075880 extends A071383 {

  private final Sequence mA = new A001481();
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = super.next();
    while (true) {
      ++mN;
      if (mA.next().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
