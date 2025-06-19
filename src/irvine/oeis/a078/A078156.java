package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A078156 A078153(n!).
 * @author Sean A. Irvine
 */
public class A078156 extends Sequence1 {

  private final Sequence mS = new A078162().skip();
  private long mN = 0;

  @Override
  public Z next() {
    return mS.next().subtract(Functions.SIGMA1.z(Functions.FACTORIAL.z(++mN)));
  }
}
