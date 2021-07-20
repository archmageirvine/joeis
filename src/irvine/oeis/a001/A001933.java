package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000105;
import irvine.oeis.a234.A234006;
import irvine.oeis.a234.A234007;
import irvine.oeis.a234.A234008;

/**
 * A001933 Chessboard polyominoes with n squares.
 * Chessboard polyominoes with n squares.
 * For odd n, <code>a(n) = 2*A000105(n)</code>.
 * For even n, <code>a(n) = 2*A000105(n) - (M(n) + R90(n) + R180(n))</code>.
 * @author jmason
 */
public class A001933 implements Sequence {

  private int mMax = 0;
  private final A000105 mA000105 = new A000105(); // valid for all values of n
  private final A234006 mA234006 = new A234006(); // valid for n multiple of 2
  private final A234007 mA234007 = new A234007(); // valid for n multiple of 4
  private final A234008 mA234008 = new A234008(); // valid for n multiple of 2
  {
    mA000105.next();
  }

  @Override
  public Z next() {
    final Z t = mA000105.next().multiply2();
    return (++mMax & 1) == 1 ? t : t.subtract(m().add(r90()).add(r180()));
  }

  private Z m() {
    return (mMax & 1) == 0 ? mA234006.next() : Z.ZERO;
  }

  private Z r90() {
    return (mMax & 3) == 0 ? mA234007.next() : Z.ZERO;
  }

  private Z r180() {
    return (mMax & 1) == 0 ? mA234008.next() : Z.ZERO;
  }
}
