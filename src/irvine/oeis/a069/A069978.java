package irvine.oeis.a069;
// Generated by gen_seq4.pl 2023-11-13/lambdan at 2023-11-17 15:02

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.LambdaSequence;

/**
 * A069978 (Sum of digits of n)^4 - (sum of digits of n^4).
 * @author Georg Fischer
 */
public class A069978 extends LambdaSequence {

  /** Construct the sequence. */
  public A069978() {
    super(0, n -> Z.valueOf(ZUtils.digitSum(n)).pow(4).subtract(ZUtils.digitSum(Z.valueOf(n).pow(4))));
  }
}
