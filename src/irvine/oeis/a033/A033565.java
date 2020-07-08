package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.ChildGeneratorFactory;
import jmason.poly.PolyominoCounter;

/**
 * A033565 Partially directed animals on the square lattice.
 * @author Sean A. Irvine
 */
public class A033565 implements Sequence {

  private int mMax = -1;

  @Override
  public Z next() {
    if (++mMax == 0) {
      return Z.ONE;
    }
    final PolyominoCounter pc = new PolyominoCounter(mMax, false, false, false);
    pc.setGenerator(ChildGeneratorFactory.DIRECTED_GENERATOR);
    pc.run(true, true, false);
    return Z.valueOf(pc.getCu().getCounter(mMax));
  }
}
