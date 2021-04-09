package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000042;

/**
 * A046414 Repunit of length a(n) has exactly 3 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046414 extends A000042 {

  private long mN = 1;
  {
    super.next(); // skip 1
  }

  protected long target() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z rep = super.next();
      final long omega = Jaguar.factorAllowIncomplete(rep).bigOmegaBound();
      if (omega < 0 && omega >= -target()) {
        throw new UnsupportedOperationException("Cannot factor (n=" + mN + "): " + rep);
      }
      if (omega == target()) {
        return Z.valueOf(mN);
      }
    }
  }
}
