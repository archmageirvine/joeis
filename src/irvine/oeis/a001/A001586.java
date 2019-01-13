package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000364;

/**
 * A001586.
 * @author Sean A. Irvine
 */
public class A001586 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    ++mN;
    final A000364 euler = new A000364();
    boolean add = true;
    for (int k = 0; k <= mN; k += 2) {
      final Z t = euler.next().multiply(Binomial.binomial(mN, k)).shiftLeft(k);
      s = s.signedAdd(add, t);
      add = !add;
    }
    return s.abs();
  }
}
