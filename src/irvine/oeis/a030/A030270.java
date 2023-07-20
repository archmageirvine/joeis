package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001333;

/**
 * A030270 Number of nonisomorphic and nonantiisomorphic reflexive transitive and cotransitive (complement is transitive) relations.
 * @author Sean A. Irvine
 */
public class A030270 extends Sequence0 {

  private final MemorySequence mA1333 = MemorySequence.cachedSequence(new A001333());
  private int mN = -1;

  @Override
  public Z next() {
    return mA1333.a(++mN).add(mA1333.a((mN + 2) / 2)).divide2();
  }
}
