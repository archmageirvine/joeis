package irvine.oeis.a395;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A395002 Number of index 4*n subgroups of SL_2(Z) not containing the negative identity matrix.
 * @author Sean A. Irvine
 */
public class A395002 extends CachedSequence {

  /** Construct the sequence. */
  public A395002() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      if (n == 2) {
        return Z.EIGHT;
      }
      if (n == 3) {
        return Z.valueOf(22);
      }
      final long k = n - 3;
      final Z t = self.a(k + 1).multiply2().add(self.a(k).multiply(4 * k + 12));
      return t.add(Integers.SINGLETON.sum(1, k - 1, j -> self.a(j).multiply(self.a(k - j))));
    });
  }
}
