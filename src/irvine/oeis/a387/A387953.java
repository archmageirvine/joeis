package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A387953 Numbers k such that sigma(k) = psi(k) + tau(k).
 * @author Sean A. Irvine
 */
public class A387953 extends UnionSequence {

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
        if (mM.gcd(p).isOne()) {
          return mM.multiply(p.square());
        }
      }
    }
  }

  /** Construct the sequence. */
  public A387953() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 27),
      new MySequence(5),
      new MySequence(6)
    );
  }
}
