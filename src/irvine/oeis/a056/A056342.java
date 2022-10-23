package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a027.A027383;
import irvine.oeis.a052.A052823;

/**
 * A056342 Number of bracelets of length n using exactly two different colored beads.
 * @author Sean A. Irvine
 */
public class A056342 extends Sequence1 {

  private final Sequence mA = new A052823();
  private final Sequence mB = new PrependSequence(new A027383(), 0);
  {
    mA.next();
  }

  @Override
  public Z next() {
    return mA.next().add(mB.next()).divide2();
  }
}
