package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000011;
import irvine.oeis.a000.A000013;

/**
 * A059053 Number of chiral pairs of necklaces with n beads and two colors (color complements being equivalent); i.e., turning the necklace over neither leaves it unchanged nor simply swaps the colors.
 * @author Sean A. Irvine
 */
public class A059053 extends A000013 {

  private final Sequence mA = new A000011();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
