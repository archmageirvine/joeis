package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001203.
 * @author Sean A. Irvine
 */
public class A001203 implements Sequence {

  private CR mU = CR.PI;

  @Override
  public Z next() {
    final Z a = mU.floor(32);
    final CR d = mU.subtract(CR.valueOf(a));
    mU = d.inverse();
    return a;
  }
}
