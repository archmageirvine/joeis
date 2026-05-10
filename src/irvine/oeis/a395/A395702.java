package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000798;
import irvine.oeis.a006.A006905;

/**
 * A395702 Number of transitive relations on an n-set that are neither reflexive nor symmetric.
 * @author Sean A. Irvine
 */
public class A395702 extends Sequence0 {

  private final Sequence mA = new A006905();
  private final Sequence mB = new A000798();
  private long mN = 0;

  @Override
  public Z next() {
    return mA.next().subtract(mB.next()).add(Functions.BELL.z(mN++)).subtract(Functions.BELL.z(mN));
  }
}
