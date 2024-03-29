package irvine.oeis.a337;
// Generated by gen_seq4.pl dersimple at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a000.A000088;

/**
 * A337518 Number of non-isomorphic graphs on n unlabeled nodes modulo 3.
 * @author Georg Fischer
 */
public class A337518 extends A000088 {

  @Override
  public Z next() {
    return super.next().mod(Z.THREE);
  }
}
