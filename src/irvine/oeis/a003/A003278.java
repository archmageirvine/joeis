package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003278 Szekeres's sequence: <code>a(n)-1</code> in ternary <code>= n-1</code> in binary; also: <code>a(1) = 1, a(2) = 2, a(n)</code> is smallest number k which avoids <code>any</code> 3-term arithmetic progression in <code>a(1), a(2), ..., a(n-1), k</code>.
 * @author Sean A. Irvine
 */
public class A003278 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN), 3).add(1);
  }

}
