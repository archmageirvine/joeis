package irvine.oeis.a095;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000796;
import irvine.oeis.triangle.Triangle;

/**
 * A095709 Triangle of numbers obtained by reversing the first n digits of Pi and juxtaposing.
 * @author Georg Fischer
 */
public class A095709 extends Triangle {

  protected final Sequence mPi;

  /** Construct the sequence. */
  public A095709() {
    mPi = new A000796();
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? mPi.next() : get(n - 1, k - 1);
  }
}
