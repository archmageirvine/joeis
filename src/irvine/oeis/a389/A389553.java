package irvine.oeis.a389;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A152004.
 * @author Sean A. Irvine
 */
public class A389553 extends Sequence1 {

  private final LinkedList<Integer> mA = new LinkedList<>();
  private int mN = 3;
  private final MemoryFunction1<FactorSequence> mF = new MemoryFunction1<>() {
    @Override
    protected FactorSequence compute(final int n) {
      return Jaguar.factor(Functions.FACTORIAL.z(n));
    }
  };

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final FactorSequence cfs = mF.get(++mN);
      for (int a = 1; a < mN - 1; ++a) { // slight contortions to sort in desired order
        final FactorSequence afs = mF.get(a);
        for (int b = a + 1; b < mN; ++b) {
          final FactorSequence bfs = new FactorSequence(mF.get(b));
          bfs.merge(afs);
          bfs.merge(cfs);
          if (bfs.isSquare()) {
            mA.add(a);
            mA.add(b);
            mA.add(mN);
          }
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
