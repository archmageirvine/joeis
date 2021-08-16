package irvine.oeis.a050;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050499 Nearest integer to n/log(n).
 * @author Sean A. Irvine
 */
public class A050499 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    final CR n = CR.valueOf(++mN);
    return n.divide(n.log()).round();
  }
}
