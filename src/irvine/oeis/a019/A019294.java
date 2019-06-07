package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019294 Number <code>(&gt;0)</code> of iteration of sigma <code>(A000203)</code> required to reach a value divisible by n when starting with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A019294 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    Z m = mN;
    do {
      ++c;
      m = Jaguar.factor(m).sigma();
    } while (!m.mod(mN).equals(Z.ZERO));
    return Z.valueOf(c);
  }
}

