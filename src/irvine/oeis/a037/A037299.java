package irvine.oeis.a037;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.HomePrimeSequence;
import irvine.oeis.a002.A002808;

/**
 * A037299.
 * @author Sean A. Irvine
 */
public class A037299 extends A002808 {

  private final List<Z> mA = new ArrayList<>();
  private int mM = 0;

  @Override
  public Z next() {
    if (mM >= mA.size()) {
      mM = 0;
      mA.clear();
      final Z n = super.next();
      final HomePrimeSequence hp = new HomePrimeSequence(n.longValueExact());
      Z r = null;
      Z p = null;
      Z q;
      while ((q = hp.next()) != null) {
        r = p;
        p = q;
      }
      // The factors of r are what we need
      final FactorSequence fs = Jaguar.factor(r);
      for (final Z t : fs.toZArray()) {
        for (int k = 0; k < fs.getExponent(t); ++k) {
          mA.add(t);
        }
      }
    }
    return mA.get(mM++);
  }
}

