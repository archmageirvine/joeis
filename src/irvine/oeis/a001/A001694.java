package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001694 Powerful numbers, definition <code>(1)</code>: if a prime p divides n then <code>p^2</code> must also divide <code>n</code> (also called squareful, square full, square-full or <code>2-powerful</code> numbers).
 * @author Sean A. Irvine
 */
public class A001694 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (true) {
      final FactorSequence fs = Cheetah.factor(mN);
      boolean ok = true;
      for (final Z f : fs.toZArray()) {
        if (fs.getExponent(f) == 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
      ++mN;
    }
  }
}
