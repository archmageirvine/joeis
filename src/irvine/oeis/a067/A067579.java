package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067579 Conjectured values of a(n) defined by: a(n) = first prime appearing in the orbit n, f(n), f(f(n)),...., if it exists; = 0 otherwise, where f(n) = n + sigma(n).
 * @author Sean A. Irvine
 */
public class A067579 extends Sequence1 {

  private static final int HEURISTIC_LIMIT = 400;
  private Z mN = Z.ZERO;

  private Z f(final Z n) {
    return Jaguar.factor(n).sigma().add(n);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    Z f = mN;
    while (f.bitLength() < HEURISTIC_LIMIT) {
      if (f.isProbablePrime()) {
        return f;
      }
      f = f(f);
    }
    return Z.ZERO;
  }

  /**
   * Direct access main.
   * @param args start value
   */
  public static void main(final String... args) {
    final A067579 seq = new A067579();
    seq.mN = new Z(args[0]).subtract(1);
    System.out.println(seq.next());
  }
}
