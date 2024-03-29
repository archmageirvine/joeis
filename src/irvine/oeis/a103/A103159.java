package irvine.oeis.a103;
// Generated by gen_seq4.pl gcd.rob/lambdan at 2024-01-26 19:31

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.LambdaSequence;

/**
 * A103159 a(n) = GCD(reverse(n), reversed(n+1)).
 * @author Georg Fischer
 */
public class A103159 extends LambdaSequence {

  /** Construct the sequence. */
  public A103159() {
    super(1, n -> ZUtils.reverse(Z.valueOf(n)).gcd(ZUtils.reverse(Z.valueOf(n + 1))));
  }
}
