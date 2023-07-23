package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A060467 Value of z of the solution to x^3 + y^3 + z^3 = A060464(n) (numbers not 4 or 5 mod 9) with smallest |z| and smallest |y|, 0 &lt;= |x| &lt;= |y| &lt;= |z|.
 * @author Sean A. Irvine
 */
public class A060467 extends AbstractSequence {

  private final A060464 mSeq1 = new A060464();

  /** Construct the sequence. */
  public A060467() {
    super(0);
  }

  @Override
  public Z next() {
    final Z n = mSeq1.next();
    if (n.isZero()) {
      return Z.ZERO;
    }
    long z = 0;
    while (true) {
      final Z zz = Z.valueOf(++z);
      final Z z3 = zz.pow(3);
      final Z nz3 = n.subtract(z3);
      if (nz3.isZero()) {
        return zz;
      }
      final Z pz3 = n.add(z3);
      for (long y = 0; y <= z; ++y) {
        final Z y3 = Z.valueOf(y).pow(3);
        final Z x1 = A060465.check(nz3.subtract(y3), y, z, n);
        if (x1 != null) {
          return Z.valueOf(z);
        }
        final Z x2 = A060465.check(nz3.add(y3), y, z, n);
        if (x2 != null) {
          return Z.valueOf(z);
        }
        final Z x3 = A060465.check(pz3.subtract(y3), y, z, n);
        if (x3 != null) {
          return Z.valueOf(-z);
        }
        final Z x4 = A060465.check(pz3.add(y3), y, z, n);
        if (x4 != null) {
          return Z.valueOf(-z);
        }
      }
    }
  }
}
