package irvine.oeis.a132;
// manually 2026-02-28

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A132272 a(n) = Product_{k&gt;0} (1 + floor(n/10^k)).
 * @author Georg Fischer
 */
public class A132272 extends AbstractSequence {

  private long mN; // current index

  /** Construct the sequence. */
  public A132272() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    Z a = Z.ONE;
    Z p10 = Z.ONE;
    while (true) {
      p10 = p10.multiply(Z.TEN);
      final Z f = Z.valueOf(mN).divide(p10);
      if (f.compareTo(Z.ZERO) <= 0) {
        return a;
      }
      a = a.multiply(f.add(1));
    }
  }
}
