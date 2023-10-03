package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066174 First member of a prime sextet: p, (p-1)/2, (p-3)/4, (p-7)/8, (p-15)/16, (p-31)/32.
 * @author Sean A. Irvine
 */
public class A066174 extends A000040 {

  private final int mSteps;

  protected A066174(final int steps) {
    mSteps = steps;
  }

  /** Construct the sequence. */
  public A066174() {
    this(5);
  }

  private boolean is(Z p) {
    for (int k = 0; k < mSteps; ++k) {
      if (!p.isOdd()) {
        return false;
      }
      p = p.divide2(); // (p-1)/2
      if (!p.isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
