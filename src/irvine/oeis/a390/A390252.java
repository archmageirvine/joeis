package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A390252 Numbers k such that sigma(k) = psi(k) + omega(k)^3.
 * @author Sean A. Irvine
 */
public class A390252 extends UnionSequence {

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
  public A390252() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 1),
      new MySequence(7),
      new SimpleTransformSequence(new A000040(), Z::square)
    );
  }
}
