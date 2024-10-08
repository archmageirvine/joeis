package irvine.oeis.a090;
// Generated by gen_seq4.pl 2024-07-27.ack/lambdan at 2024-07-27 22:17

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A090769 a(n) = 7^(n^2+2n+1)*Product_{j=1..n} (49^j-1).
 * @author Georg Fischer
 */
public class A090769 extends LambdaSequence {

  /** Construct the sequence. */
  public A090769() {
    super(0, n -> Z.SEVEN.pow(Z.valueOf(n).square().add(Z.TWO.multiply(Z.valueOf(n))).add(Z.ONE)).multiply(Integers.SINGLETON.product(1, n, j -> Z.valueOf(49).pow(Z.valueOf(j)).subtract(Z.ONE))));
  }
}
