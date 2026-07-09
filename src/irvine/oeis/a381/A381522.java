package irvine.oeis.a381;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.a386.A386016;

/**
 * A381522 Sequence where k is appended after every k^2 occurrences of 1, with multiple values following a 1 listed in order.
 * @author Sean A. Irvine
 */
public class A381522 extends A386016 {

  /** Construct the sequence. */
  public A381522() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : Zeta.zeta(2).multiply(Z.valueOf(n).square()).inverse();
      }
    });
  }
}

