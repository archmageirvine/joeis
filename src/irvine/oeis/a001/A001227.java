package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001227 Number of odd divisors of n.
 * @author Sean A. Irvine
 */
public class A001227 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.isOdd()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
