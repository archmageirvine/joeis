package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086145 Triangle read by rows in which T(n,k) is the least positive integer s such that p divides k^s-1, where p=prime(n) and k ranges from 1 to p-1.
 * @author Sean A. Irvine
 */
public class A086145 extends Sequence1 {

  private long mP = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mP) {
      mP = Functions.NEXT_PRIME.l(mP);
      mM = 1;
    }
    return Functions.ORDER.z(mP, mM);
  }
}
