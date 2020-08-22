package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a115.A115000;

/**
 * A029937 Genus of modular curve X_1(n).
 * @author Sean A. Irvine
 */
public class A029937 extends A029935 {

  private final Sequence mA = new PrependSequence(new A115000(), -1, -1, 0, 0);

  @Override
  public Z next() {
    return Z.ONE.add(mA.next()).subtract(super.next().divide(4));
  }
}
