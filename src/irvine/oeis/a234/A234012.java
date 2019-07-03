package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.PolyominoCounter;

/**
 * A234012.
 * @author jmason
 */
public class A234012 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    mMax += 2;
    final PolyominoCounter pc = new PolyominoCounter(mMax, true, false, false);
    pc.run(true, false, false);
    return Z.valueOf(pc.getUnbcu().getCounter(mMax));
  }
}
