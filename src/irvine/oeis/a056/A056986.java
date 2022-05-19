package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a000.A000142;

/**
 * A056986 Number of permutations on {1,...,n} containing any given pattern alpha in the symmetric group S_3.
 * @author Sean A. Irvine
 */
public class A056986 extends A000142 {

  private final Sequence mA = new A000108();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
