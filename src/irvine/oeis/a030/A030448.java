package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.ChildGeneratorFactory;
import jmason.poly.PolyominoCounter;

/**
 * A030448 Number of n-celled polyknights without bilateral symmetry.
 * @author Sean A. Irvine
 */
public class A030448 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    final PolyominoCounter pc = new PolyominoCounter(++mMax, false, false, true);
    pc.setGenerator(ChildGeneratorFactory.POLYKNIGHT_GENERATOR);
    pc.run(true, false, false);
    return Z.valueOf(pc.getAsymmetricCounter().getCounter(mMax));
  }
}
