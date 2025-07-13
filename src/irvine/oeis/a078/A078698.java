package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051286;

/**
 * A078698 Number of ways to lace a shoe that has n pairs of eyelets such that each eyelet has at least one direct connection to the opposite side.
 * @author Sean A. Irvine
 */
public class A078698 extends Sequence1 {

  private final Sequence mA = new A051286().skip();
  private int mN = -1;

  @Override
  public Z next() {
    return mA.next().multiply(Functions.FACTORIAL.z(++mN).square());
  }
}

