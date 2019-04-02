package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014216 a(n) = floor(log(5)^n).
 * @author Sean A. Irvine
 */
public class A014216 implements Sequence {

  private static final CR N = CR.FIVE.log();
  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(N, ++mN).floor(32);
  }
}
