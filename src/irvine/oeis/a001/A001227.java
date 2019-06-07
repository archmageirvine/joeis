package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001227 Number of odd divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A001227 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      if (!d.isEven()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
