package irvine.oeis.a333;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A333108 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A333108 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.sin().multiply(n.cos()).multiply(n).floor();
  }
}
