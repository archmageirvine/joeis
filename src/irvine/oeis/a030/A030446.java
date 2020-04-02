package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.ChildGeneratorFactory;
import jmason.poly.PolyominoCounter;

/**
 * A030446 Number of n-celled polyknights (polyominoes connected by knight's moves).
 * @author Sean A. Irvine
 */
public class A030446 implements Sequence {

  private int mMax = 0;

  protected Z count(final PolyominoCounter pc) {
    return Z.valueOf(pc.getCu().getCounter(mMax));
  }

  @Override
  public Z next() {
    final PolyominoCounter pc = new PolyominoCounter(++mMax, false, false, false);
    pc.setGenerator(ChildGeneratorFactory.POLYKNIGHT_GENERATOR);
    pc.run(true, false, false);
    return count(pc);
  }
}
