package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A394925 Numbers k such that sigma(k) = psi(k) + tau(k) + Omega(k)^6.
 * @author Sean A. Irvine
 */
public class A394925 extends UnionSequence {

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
        if (Functions.GCD.z(mM, p).isOne()) {
          return mM.multiply(p.square());
        }
      }
    }
  }

  /** Construct the sequence. */
  public A394925() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 10936, 85375, 1115251, 5419871, 45326591, 198850411, 1593059935, 5108995726L),
      new MySequence(21606)
    );
  }
}

