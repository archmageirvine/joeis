package irvine.oeis.a083;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a071.A071904;

/**
 * A083574 Triangle read by rows: the prime factors of composite odd n with multiplicity.
 * @author Sean A. Irvine
 */
public class A083574 extends Sequence1 {

  private final Sequence mS = new A071904();
  private final LinkedList<Z> mA = new LinkedList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final FactorSequence fs = Jaguar.factor(mS.next());
      for (final Z p : fs.toZArray()) {
        for (int k = 0; k < fs.getExponent(p); ++k) {
          mA.add(p);
        }
      }
    }
    return mA.pollFirst();
  }
}
