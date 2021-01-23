package irvine.oeis.a035;

import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035306 List prime factors of each number in order (each prime factor is followed by its power). Start with 1 = {1,1}.
 * @author Sean A. Irvine
 */
public class A035306 implements Sequence {

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
        mA.add(Z.ONE);
      } else {
        final FactorSequence fs = Cheetah.factor(mN);
        for (final Z p : fs.toZArray()) {
          mA.add(p);
          mA.add(Z.valueOf(fs.getExponent(p)));
        }
      }
    }
    return mA.get(mM);
  }
}

