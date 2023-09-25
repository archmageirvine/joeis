package irvine.oeis.a348;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A348477 Drop all 1 but the first 1 in A035306.
 * List of prime divisors of n and their exponents, ignoring the exponent 1.
 * @author Georg Fischer
 */
public class A348477 extends Sequence1 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private long mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      mM = 0;
      if (++mN == 1) {
        mA.add(Z.ONE);
      } else {
        final FactorSequence fs = Jaguar.factor(mN);
        for (final Z p : fs.toZArray()) {
          final int ep = fs.getExponent(p);
          mA.add(p);
          if (ep > 1) {
            mA.add(Z.valueOf(ep));
          }
        }
      }
    }
    return mA.get(mM);
  }
}
