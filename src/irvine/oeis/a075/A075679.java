package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.PolySideCounter;

/**
 * A075679.
 * @author jmason
 */
public class A075679 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    return Z.valueOf(new PolySideCounter(++mMax).getCu().getCounter(mMax));
  }
}
