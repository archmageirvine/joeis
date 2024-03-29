package irvine.oeis.a070;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A070953 Order of the group GU(n,2), the general unitary n X n matrices over the finite field GF(4).
 * a(n)=3*2^(n*(n-1)/2)*prod(k=1,n-1,2^(k+1)-(-1)^(k+1))
 * @author Georg Fischer
 */
public class A070953 extends LambdaSequence {

  /** Construct the sequence. */
  public A070953() {
    super(1, n -> Z.THREE.multiply(Z.TWO.pow(Z.valueOf(n).multiply(Z.valueOf(n - 1)).divide2())).multiply(Integers.SINGLETON.product(1, n - 1, k -> Z.ONE.shiftLeft(k + 1).subtract(Z.NEG_ONE.pow(k + 1)))));
  }
}
