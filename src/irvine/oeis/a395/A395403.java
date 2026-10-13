package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A395403 Numbers k such that sigma(k) = psi(k) + tau(k)^3 + Omega(k)^3.
 * @author Sean A. Irvine
 */
public class A395403 extends UnionSequence {

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
  public A395403() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 1528, 24353, 62557, 123708, 131516, 152303, 506447, 1085007, 1142053, 2505377, 13935742),
      new MySequence(1561),
      new MySequence(1651),
      new MySequence(59890),
      new MySequence(66674)
    );
  }
}
