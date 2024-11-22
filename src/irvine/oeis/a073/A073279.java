package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073279.
 * @author Sean A. Irvine
 */
public class A073279 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    return CR.valueOf(f).log10().multiply(f).floor().add(1);
  }
}
