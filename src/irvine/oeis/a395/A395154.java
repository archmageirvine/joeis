package irvine.oeis.a395;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a386.A386016;

/**
 * A395154 allocated for Pontus von Br\u00f6mssen.
 * @author Sean A. Irvine
 */
public class A395154 extends A386016 {

  /** Construct the sequence. */
  public A395154() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : CR.valueOf(new Q(n + 1, n)).log();
      }
    });
  }
}

