package irvine.oeis.a145;
// Generated by gen_seq4.pl dersimple at 2021-08-21 22:23

import irvine.math.z.Z;
import irvine.oeis.a049.A049092;

/**
 * A145199 Nonsquarefree numbers k such that k+1 is prime.
 * @author Georg Fischer
 */
public class A145199 extends A049092 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
