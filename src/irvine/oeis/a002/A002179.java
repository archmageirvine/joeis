package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a100.A100640;

/**
 * A002179 Numerators of Cotesian numbers (not in lowest terms): A002176*C(n,2).
 * @author Sean A. Irvine
 */
public class A002179 extends A002176 {

  /** Construct the sequence. */
  public A002179() {
    super(2);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return A100640.cotesian(mN, 2).multiply(t).toZ();
  }
}
