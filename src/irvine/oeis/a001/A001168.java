package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.PolyominoCounter;

/**
 * A001168 Number of fixed polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A001168 implements Sequence {

  private int mMax = -1;

  @Override
  public Z next() {
    if (++mMax == 0) {
      return Z.ONE;
    }
    final PolyominoCounter pc = new PolyominoCounter(mMax, false, false, false);
    pc.run(true, true, false);
    return Z.valueOf(pc.getCu().getCounter(mMax));
  }
}
