package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072631 Floor( n*log(n) ) mod n.
 * @author Sean A. Irvine
 */
public class A072631 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.multiply(n.log()).floor().mod(Z.valueOf(mN));
  }
}
