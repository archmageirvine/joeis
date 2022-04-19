package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000029;
import irvine.oeis.a027.A027671;

/**
 * A056343 Number of bracelets of length n using exactly three different colored beads.
 * @author Sean A. Irvine
 */
public class A056343 implements Sequence {

  private final Sequence mA = new A027671();
  private final Sequence mB = new A000029();
  {
    next();
  }

  @Override
  public Z next() {
    return mA.next().subtract(mB.next().multiply(3)).add(3);
  }
}
