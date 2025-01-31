package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074836 a(1) = 1, a(n) = the largest prime divisor of concatenation of sequence (n,n-1,..,2,1,2,..,n-1,n) A007942.
 * @author Sean A. Irvine
 */
public class A074836 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      mA.append('1');
    } else {
      mA.insert(0, mN);
      mA.append(mN);
    }
    return Functions.GPF.z(new Z(mA));
  }
}
