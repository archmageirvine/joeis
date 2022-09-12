package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059078 Number of orientable necklaces with 2n beads and two colors which when turned over produce their own color complement.
 * @author Sean A. Irvine
 */
public class A059078 extends A059076 {

  private final Sequence mA = new A059053();

  @Override
  public Z next() {
    final Z t = super.next().subtract(mA.next().multiply2());
    super.next();
    mA.next();
    return t;
  }
}
