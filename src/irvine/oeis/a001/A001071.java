package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000988;
import irvine.oeis.a234.A234006;
import irvine.oeis.a234.A234007;
import irvine.oeis.a234.A234008;

/**
 * A001071.
 * a(n) = 2*A000988(n) - M(n) -2*(R90(n) + R180(n))
 * @author jmason
 */
public class A001071 implements Sequence {

  private int mN = 0;
  private final A000988 mA000988 = new A000988(); // valid for all values of n
  private final A234006 mA234006 = new A234006(); // valid for n multiple of 2
  private final A234007 mA234007 = new A234007(); // valid for n multiple of 4
  private final A234008 mA234008 = new A234008(); // valid for n multiple of 2

  @Override
  public Z next() {
    ++mN;
    return mA000988.next().multiply2().subtract(m()).subtract(r90().add(r180()).multiply2());
  }

  private Z m() {
    return (mN & 1) == 0 ? mA234006.next() : Z.ZERO;
  }

  private Z r90() {
    return (mN & 3) == 0 ? mA234007.next() : Z.ZERO;
  }

  private Z r180() {
    return (mN & 1) == 0 ? mA234008.next() : Z.ZERO;
  }
}
