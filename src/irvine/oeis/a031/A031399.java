package irvine.oeis.a031;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003814;

/**
 * A031399 Numbers n with no <code>4k+3</code> factors such that Pell equation <code>x^2 - n y^2 = -1</code> insoluble.
 * @author Sean A. Irvine
 */
public class A031399 implements Sequence {

  private final Sequence mA = new ComplementSequence(new A003814(), Z.TWO);

  private boolean is4kp3Free(final FactorSequence fs) {
    for (final Z p : fs.toZArray()) {
      if (p.mod(4) == 3) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z a = mA.next();
      final FactorSequence fs = Cheetah.factor(a);
      if (is4kp3Free(fs)) {
        return a;
      }
    }
  }
}
