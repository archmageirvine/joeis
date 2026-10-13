package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A395142 Numbers k such that sigma(k) = psi(k) + tau(k) + Omega(k)^10.
 * @author Sean A. Irvine
 */
public class A395142 extends UnionSequence {

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
  public A395142() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 21845375, 813730722086L, 26688150502064735L),
      new MySequence(30205446)
    );
  }
}
