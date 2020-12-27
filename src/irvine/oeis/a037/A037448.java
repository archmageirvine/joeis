package irvine.oeis.a037;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037448.
 * @author Sean A. Irvine
 */
public class A037448 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.cot(CR.valueOf(++mN)).floor();
  }
}
