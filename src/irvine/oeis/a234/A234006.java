package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import jmason.poly.MirrorCounter;

/**
 * A234006 Free polyominoes with 2n squares, having reflectional symmetry on axis that coincides with edges.
 * @author jmason
 */
public class A234006 extends Sequence1 {

  private int mMax = 0;

  @Override
  public Z next() {
    mMax += 2;
    return Z.valueOf(new MirrorCounter(mMax, true, false, false).getAccum().getCounter(mMax));
  }
}
