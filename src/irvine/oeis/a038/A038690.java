package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038690 a(n)^2 is smallest square containing the string 'n'.
 * @author Sean A. Irvine
 */
public class A038690 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long k = -1;
    while (!Z.valueOf(++k).square().toString().contains(s)) {
      // do nothing
    }
    return Z.valueOf(k);
  }
}
