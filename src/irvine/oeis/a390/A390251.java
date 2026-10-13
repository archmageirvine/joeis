package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A390251 Numbers k such that sigma(k) = psi(k) + omega(k)^2.
 * @author Sean A. Irvine
 */
public class A390251 extends UnionSequence {

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
  public A390251() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 1),
      new MySequence(3),
      new SimpleTransformSequence(new A000040(), Z::square)
    );
  }
}
