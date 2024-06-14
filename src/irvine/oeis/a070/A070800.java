package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A070800 Smallest prime greater than phi(n): a(n) = nextprime(phi(n)).
 * @author Sean A. Irvine
 */
public class A070800 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Functions.NEXT_PRIME.z(Functions.PHI.l(++mN));
  }
}
