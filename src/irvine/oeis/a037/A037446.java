package irvine.oeis.a037;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037446.
 * @author Sean A. Irvine
 */
public class A037446 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final CR t = CR.valueOf(++mN).divide(CR.E);
    return ComputableReals.SINGLETON.pow(t, t).floor();
  }
}
