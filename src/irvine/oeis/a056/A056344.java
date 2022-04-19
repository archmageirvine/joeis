package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056344 Number of bracelets of length n using exactly four different colored beads.
 * @author Sean A. Irvine
 */
public class A056344 implements Sequence {

  private final Sequence mA = new A056284();
  private final Sequence mB = new A056490();

  @Override
  public Z next() {
    return mA.next().add(mB.next()).divide2();
  }
}
