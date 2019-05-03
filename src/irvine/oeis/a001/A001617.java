package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000086;
import irvine.oeis.a000.A000089;

/**
 * A001617 Genus of modular group <code>Gamma_0(n)</code>. Or, genus of modular curve <code>X_0(n)</code>.
 * @author Sean A. Irvine
 */
public class A001617 extends A001616 {

  private final A001615 mA = new A001615();
  private final A000089 mB = new A000089();
  private final A000086 mC = new A000086();

  @Override
  public Z next() {
    final Z t = mA.next()
      .subtract(mB.next().multiply(3))
      .subtract(mC.next().multiply(4))
      .subtract(super.next().multiply(6));
    return Z.ONE.add(t.divide(12));
  }
}
