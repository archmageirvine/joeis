package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A392520 Numbers k such that sigma(k) = psi(k) + tau(k)^2 + omega(k)^3.
 * @author Sean A. Irvine
 */
public class A392520 extends UnionSequence {

  private static final class MySequence extends A000040 {
    private final Z mM;

    /** Construct the sequence. */
    private MySequence(final long m) {
      mM = Z.valueOf(m);
    }

    @Override
    public Z next() {
      while (true) {
        final Z p = super.next();
        if (!mM.mod(p).isZero()) {
          return mM.multiply(p.square());
        }
      }
    }
  }

  /** Construct the sequence. */
  public A392520() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 184, 459, 1375, 6655, 14739, 24334),
      new MySequence(43),
      new MySequence(399)
    );
  }
}
