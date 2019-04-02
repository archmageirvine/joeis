package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000010 Euler totient function phi(n): count numbers &lt;= n and prime to n.
 * @author Sean A. Irvine
 */
public class A000010 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.phi(++mN));
  }
}

