package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a006.A006013;

/**
 * A085405 Common residues of binomial(3n+2,n+1)/(3n+2) modulo 2.
 * @author Georg Fischer
 */
public class A085405 extends A006013 {

  @Override
  public Z next() {
    return super.next().mod(Z.TWO);
  }
}
