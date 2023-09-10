package irvine.oeis.a065;

import irvine.math.z.Carmichael;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065658.
 * @author Sean A. Irvine
 */
public class A065695 extends A000040 {

  private final long mB;
  private final long mC;

  protected A065695(final long b, final long c) {
    mB = b;
    mC = c;
  }

  /** Construct the sequence. */
  public A065695() {
    this(2, 53);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z m = p.subtract(1);
      final Z m1, m2;
      if ((m1 = m.multiply(mB).add(1)).isProbablePrime() && (m2 = m.multiply(mC).add(1)).isProbablePrime()) {
        final Z n = p.multiply(m1).multiply(m2);
        final Z lambda = Carmichael.lambda(n);
        if (n.mod(lambda).equals(Z.ONE)) {
          return m;
        }
      }
    }
  }
}
