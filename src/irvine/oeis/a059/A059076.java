package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000029;
import irvine.oeis.a000.A000031;

/**
 * A059076 Number of pairs of orientable necklaces with n beads and two colors; i.e., turning the necklace over does not leave it unchanged.
 * @author Sean A. Irvine
 */
public class A059076 extends A000031 {

  private final Sequence mA = new A000029();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
