package irvine.oeis.a248;
// Generated by gen_seq4.pl dersimple at 2021-08-25 22:45

import irvine.math.z.Z;
import irvine.oeis.a039.A039833;

/**
 * A248201 Numbers n such that n-1, n and n+1 are all squarefree semiprimes.
 * @author Georg Fischer
 */
public class A248201 extends A039833 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
