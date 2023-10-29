package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A001227 Number of odd divisors of n.
 * @author Sean A. Irvine
 */
public class A001227 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z a(final Z n) {
    long c = 0;
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (d.isOdd()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
