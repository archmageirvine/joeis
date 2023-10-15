package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000009;
import irvine.oeis.a000.A000041;

/**
 * A056872 Numbers k such that k | p(k) + q(k) where p(k) = partition numbers (A000041) and q(k) = partition numbers into distinct parts (A000009).
 * @author Sean A. Irvine
 */
public class A056872 extends A000041 {

  /** Construct the sequence. */
  public A056872() {
    super(1);
  }

  private final Sequence mA = new A000009();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(mA.next());
      if (mN > 0 && t.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

