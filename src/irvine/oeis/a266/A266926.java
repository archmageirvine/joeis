package irvine.oeis.a266;
// Generated by gen_seq4.pl 2024-05-29/lambdan at 2024-05-29 02:16

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A266926 a(0)=0, a(1)=1, a(2)=10; for n&gt;2, a(n) = concat(a(1), ..., a(n-1)).
 * @author Georg Fischer
 */
public class A266926 extends LambdaSequence {

  /** Construct the sequence. */
  public A266926() {
    super(0, n -> (n <= 2) ? new Z(Integer.toString(n, 2)) : Z.valueOf(110).multiply(Z.TEN.pow(Z.THREE.multiply(Z.TWO.pow(n - 3))).subtract(Z.ONE)).divide(Z.valueOf(999)));
  }
}
