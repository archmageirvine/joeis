package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000700;

/**
 * A046682 Number of cycle types of conjugacy classes of all even permutations of n elements.
 * @author Sean A. Irvine
 */
public class A046682 extends A000041 {

  private final Sequence mA = new A000700();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
