package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.ChildGeneratorFactory;
import jmason.poly.PolyominoCounter;

/**
 * A030445.
 * @author Sean A. Irvine
 */
public class A030445 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    final PolyominoCounter pc = new PolyominoCounter(++mMax, false, false, false);
    pc.setGenerator(ChildGeneratorFactory.POLYKNIGHT_GENERATOR);
    pc.run(true, false, true);
    return Z.valueOf(pc.getCu().getCounter(mMax));
  }
}
