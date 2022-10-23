package irvine.oeis.a333;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A333108 a(n) = floor(n*sin(n)*cos(n)).
 * @author Sean A. Irvine
 */
public class A333108 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.sin().multiply(n.cos()).multiply(n).floor();
  }
}
