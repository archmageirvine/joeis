package irvine.oeis.a071;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071956 Table in which n-th row list prime factors and their exponents in factorization of prime(n)!.
 * @author Sean A. Irvine
 */
public class A071956 extends A000040 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN >= mA.size()) {
      mN = 0;
      mA.clear();
      final FactorSequence fs = Jaguar.factor(Functions.FACTORIAL.z(super.next()));
      for (final Z p : fs.toZArray()) {
        mA.add(p);
        mA.add(Z.valueOf(fs.getExponent(p)));
      }
    }
    return mA.get(mN);
  }
}
