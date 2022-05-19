package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a057.A057981;
import irvine.oeis.a060.A060722;

/**
 * A056989 Number of nonsingular n X n (-1,0,1)-matrices (over the reals).
 * @author Sean A. Irvine
 */
public class A056989 extends A060722 {

  private final Sequence mA = new A057981();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
