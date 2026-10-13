package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A395402 Numbers k such that sigma(k) = psi(k) + tau(k)^2 + Omega(k)^2.
 * @author Sean A. Irvine
 */
public class A395402 extends UnionSequence {

  // Union of { 352, 513, 792, 20577 } and an infinite series { 133*p^2 | p is prime not dividing 133 }

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
  public A395402() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 352, 513, 792, 20577),
      new MySequence(133)
    );
  }
}
