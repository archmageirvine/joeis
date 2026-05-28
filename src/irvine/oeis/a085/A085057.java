package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A085057 a(n) is the smallest integer of the form a*b*c.../p*q*r..., where the numerator and the denominator contain n numbers each and a,b,c,...p,q,r... are all the integers from 1 to 2n.
 * @author Sean A. Irvine
 */
public class A085057 extends Sequence1 implements Conjectural {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CORE.z(Functions.FACTORIAL.z(2 * ++mN));
  }
}
