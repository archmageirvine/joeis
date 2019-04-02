package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003278 Szekeres's sequence: a(n)-1 in ternary = n-1 in binary; also: a(1) = 1, a(2) = 2, a(n) is smallest number k which avoids any 3-term arithmetic progression in a(1), a(2), ..., a(n-1), k.
 * @author Sean A. Irvine
 */
public class A003278 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN), 3).add(1);
  }

}
