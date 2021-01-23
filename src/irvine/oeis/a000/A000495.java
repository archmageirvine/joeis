package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000495 Nearest integer to sinh(n).
 * @author Sean A. Irvine
 */
public class A000495 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.sinh(CR.valueOf(++mN)).round();
  }
}
