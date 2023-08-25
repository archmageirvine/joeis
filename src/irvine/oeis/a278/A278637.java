package irvine.oeis.a278;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A278637 Numbers k such that Fibonacci(k) is either prime or semiprime.
 * @author Georg Fischer
 */
public class A278637 extends Sequence1 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mK = 2;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      final Z f = mA.add(mB);
      mA = mB;
      mB = f;
      if (f.isProbablePrime()) {
        return Z.valueOf(mK);
      }
      final int semi = Jaguar.factor(f).isSemiprime();
      if (semi == FactorSequence.YES) {
        return Z.valueOf(mK);
      } else if (semi == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Could not factor " + f);
      }
    }
  }
}
