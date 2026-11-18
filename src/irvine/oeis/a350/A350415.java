package irvine.oeis.a350;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003087;

/**
 * A350415 Number of acyclic digraphs on n unlabeled nodes with a global source (or sink).
 * @author Gregory Morse
 */
public class A350415 extends Sequence1 {
  private final A003087 mDags = new A003087();
  private int mN = 0;

  @Override
  public Z next() {
    return mDags.nonSources(++mN, mN - 1);
  }
}
