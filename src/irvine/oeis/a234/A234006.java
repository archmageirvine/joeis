package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import jmason.poly.MirrorCounter;

/**
 * A234006 Free polyominoes with <code>2n</code> squares, having reflectional symmetry on axis that coincides with edges.
 * @author jmason
 */
public class A234006 implements Sequence {

  private int mMax = 0;

  @Override
  public Z next() {
    mMax += 2;
    return Z.valueOf(new MirrorCounter(mMax, true, false, false).getAccum().getCounter(mMax));
  }
}
