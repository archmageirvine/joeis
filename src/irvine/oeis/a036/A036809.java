package irvine.oeis.a036;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00

import irvine.math.z.Z;
import irvine.oeis.a035.A035536;

/**
 * A036809 Number of partitions satisfying (cn(0,5) &lt;= cn(1,5) = cn(4,5)).
 * @author Georg Fischer
 */
public class A036809 extends A035536 {

  /** Construct the sequence. */
  public A036809() {
    super(0, 5, 1, new int[]{});
  }

  @Override
  protected Z total(final int[] cn) {
    return (cn[0] <= cn[1] && cn[1] == cn[4]) ? Z.ONE : Z.ZERO;
  }
}
