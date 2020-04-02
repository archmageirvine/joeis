package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.ChildGeneratorFactory;
import jmason.poly.PolyominoCounter;

/**
 * A030447 Number of n-celled polyknights with bilateral symmetry.
 * @author Sean A. Irvine
 */
public class A030447 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    final PolyominoCounter pc = new PolyominoCounter(++mMax, false, false, true);
    pc.setGenerator(ChildGeneratorFactory.POLYKNIGHT_GENERATOR);
    pc.run(true, false, false);
    return Z.valueOf(pc.getCu().getCounter(mMax) - pc.getAsymmetricCounter().getCounter(mMax));
  }
}
