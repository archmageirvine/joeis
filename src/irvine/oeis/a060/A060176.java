package irvine.oeis.a060;

import irvine.factor.prime.Puma;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.AntidiagonalSequence;

/**
 * A060176 Table T(n,k) by antidiagonals of value of largest power of k-th prime which divides n.
 * @author Sean A. Irvine
 */
public class A060176 extends AntidiagonalSequence {

  /** Construct the sequence. */
  public A060176() {
    super(1, new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(int n, final int m) {
        int cnt = 0;
        final int p = (int) Puma.prime(m);
        while (n % p == 0) {
          n /= p;
          ++cnt;
        }
        return Puma.primeZ(m).pow(cnt);
      }
    });
  }
}
