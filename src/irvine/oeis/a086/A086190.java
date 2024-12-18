package irvine.oeis.a086;
// Generated by gen_seq4.pl 2024-11-18.ack/lambdan at 2024-11-18 18:53

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A086190 Sum of rank(M) over all n X n matrices over GF(3).
 * @author Georg Fischer
 */
public class A086190 extends LambdaSequence {

  /** Construct the sequence. */
  public A086190() {
    super(0, n -> Rationals.SINGLETON.sum(1, n, r -> new Q(r).multiply(Rationals.SINGLETON.product(0, r - 1, j -> (Q.THREE.pow(n).subtract(Z.THREE.pow(j))).square().divide(Q.THREE.pow(r).subtract(Z.THREE.pow(j)))))).num());
  }
}
