package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A390296 Numbers k such that sigma(k) = psi(k) + tau(k)^2.
 * @author Sean A. Irvine
 */
public class A390296 extends UnionSequence {

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
  public A390296() {
    super(1,
      new MySequence(94),
      new MySequence(115),
      new MySequence(119),
      new MySequence(282),
      new MySequence(310),
      new MySequence(322),
      new MySequence(345),
      new MySequence(357),
      new MySequence(385),
      new MySequence(930),
      new MySequence(966),
      new MySequence(1155)
    );
  }
}

