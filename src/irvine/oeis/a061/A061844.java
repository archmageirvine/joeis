package irvine.oeis.a061;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061844 Squares that remain squares if you decrease every digit by 1.
 * @author Sean A. Irvine
 */
public class A061844 extends Sequence1 {

  // After Franklin T. Adams-Watters

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ONE);
  }
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final Z lb = mT;
      mT = mT.multiply(10);
      final Z rn = mT.subtract(1).divide(9);
      for (final Z u : Jaguar.factor(rn).divisorsSorted()) {
        if (u.square().compareTo(rn) > 0) {
          break;
        }
        final Z v = rn.divide(u);
        final Z x = v.subtract(u).divide2().square();
        if (x.compareTo(lb) > 0 && x.compareTo(mT) < 0 && (Functions.SYNDROME.i(x) & 0b1000000000) == 0) {
          mA.add(u.add(v).divide2().square());
        }
      }
    }
    return mA.pollFirst();
  }
}

