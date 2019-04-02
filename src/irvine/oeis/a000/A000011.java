package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000011 Number of n-bead necklaces (turning over is allowed) where complements are equivalent.
 * @author Sean A. Irvine
 */
public class A000011 implements Sequence {

  private int mN = -1;
  private final Sequence mA000013 = new A000013();

  @Override
  public Z next() {
    return mA000013.next().add(Z.ONE.shiftLeft(++mN / 2)).divide2();
  }
}

