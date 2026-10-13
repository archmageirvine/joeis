package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A391447 Numbers k such that sigma(k) = psi(k) + tau(k) + omega(k)^5.
 * @author Sean A. Irvine
 */
public class A391447 extends UnionSequence {

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
  public A391447() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 80, 2450),
      new MySequence(37)
    );
  }
}

