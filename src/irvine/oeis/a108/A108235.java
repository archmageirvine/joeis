package irvine.oeis.a108;
// manually n2 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.a002.A002849;

/**
 * A108235 Number of partitions of {1,2,...,3n} into n triples (X,Y,Z) each satisfying X+Y=Z.
 * <code>a(n) = 0 unless n == 0 or 1 (mod 4). For n == 0 or 1 (mod 4), a(n) = A002849(3n).</code>
 * @author Georg Fischer
 */
public class A108235 extends A002849 {

  /** Construct the sequence. */
  public A108235() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    if (mN % 4 <= 1) {
      super.next();
      super.next();
      return super.next();
    } else {
      super.next();
      super.next();
      super.next();
      return Z.ZERO;
    }
  }
}
