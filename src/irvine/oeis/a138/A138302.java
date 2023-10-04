package irvine.oeis.a138;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A138302 Exponentially 2^n-numbers: 1 together with positive integers k such that all exponents in prime factorization of k are powers of 2.
 * @author Georg Fischer
 */
public class A138302 extends AbstractSequence {

  private int mN;

  /** Construct the sequence. */
  public A138302() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final FactorSequence fs = Jaguar.factor(mN);
      boolean busy = true;
      for (final Z p : fs.toZArray()) {
        if (Integer.bitCount(fs.getExponent(p)) != 1) {
          busy = false;
        }
        ;
      }
      if (busy) {
        return Z.valueOf(mN);
      }
    }
  }
}
