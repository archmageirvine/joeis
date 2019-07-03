package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.PolyominoCounter;

/**
 * A234013.
 * @author jmason
 */
public class A234013 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    final PolyominoCounter pc = new PolyominoCounter(++mMax, false, true, false);
    pc.run(true, false, false);
    return Z.valueOf(pc.getMbcu().getCounter(mMax));
  }
}
