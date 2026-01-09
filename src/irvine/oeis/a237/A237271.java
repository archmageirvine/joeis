package irvine.oeis.a237;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A237271 extends Sequence1 implements DirectSequence {

  // After Peter Luschny

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    final Z[] divs = Jaguar.factor(n).divisorsSorted();
    long s = 1;
    for (int k = 1; k < divs.length; ++k) {
      if (divs[k].isOdd() && divs[k].compareTo(divs[k - 1].multiply2()) >= 0) {
        ++s;
      }
    }
    return Z.valueOf(s);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}

