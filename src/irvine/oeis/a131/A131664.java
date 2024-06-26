package irvine.oeis.a131;
// Generated by gen_seq4.pl 2024-05-26/tablamb at 2024-05-27 00:43

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A131664 A string of n 1's repeated n times.
 * @author Georg Fischer
 */
public class A131664 extends LambdaTable {

  /** Construct the sequence. */
  public A131664() {
    super(1, 1, n -> new Integer[] {1, n}, (n, k) -> Z.TEN.pow(n).subtract(1).divide(9));
  }
}
