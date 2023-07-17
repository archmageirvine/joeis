package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000041;

/**
 * A056873 Numbers n such that n | p(n) - q(n) where p(n) = partition numbers (A000041) and q(n) = partition numbers into distinct parts (A000009).
 * @author Sean A. Irvine
 */
public class A056873 extends A000041 {

  /** Construct the sequence. */
  public A056873() {
    super(1);
  }

  private final Sequence mA = new A000009();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(mA.next());
      if (mN > 0 && t.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

