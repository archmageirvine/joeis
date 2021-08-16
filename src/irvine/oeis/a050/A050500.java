package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050500 Integer part of n/log(n).
 * @author Sean A. Irvine
 */
public class A050500 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.divide(n.log()).floor();
  }
}
