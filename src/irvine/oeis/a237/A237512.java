package irvine.oeis.a237;
// manually A258293/parmof3 at 2023-12-22 16:16

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a258.A258293;

/**
 * A237512 Number of solutions to Sum_{k=1..n} k*c(k) = n! , c(k) &gt; 0.
 * @author Georg Fischer
 */
public class A237512 extends A258293 {

  private int mN = -1;

  /** Construct the sequence. */
  public A237512() {
    super(0, 0, n -> {
      return Functions.FACTORIAL.z(n).subtract(Z.valueOf((long) n * (n + 1) / 2));
    });
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return (mN == 2) ? Z.ZERO : result;
  }
}
