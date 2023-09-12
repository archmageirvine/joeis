package irvine.oeis.a057;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057855 Greatest k such that (k-th prime) &lt;= (n times n-th prime).
 * @author Sean A. Irvine
 */
public class A057855 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return Puma.primePiZ(super.next().multiply(++mN));
  }
}
