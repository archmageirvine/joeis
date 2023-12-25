package irvine.oeis.a124;

import irvine.math.z.Z;
import irvine.oeis.a132.A132970;

/**
 * A124226 Number of partitions of n with even crank minus number of partitions of n with odd crank.
 * @author Georg Fischer
 */
public class A124226 extends A132970 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 1) ? super.next().add(2) : super.next();
  }
}
