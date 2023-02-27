package irvine.oeis.a288;

import irvine.math.z.Z;
import irvine.oeis.a006.A006352;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A288968 Exponents a(1), a(2), ... such that E_2, 1 - 24*q - 72*q^2 - ... (A006352) is equal to (1-q)^a(1) (1-q^2)^a(2) (1-q^3)^a(3) ... .
 * @author Georg Fischer
 */
public class A288968 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A288968() {
    super(1, new A006352(), 1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
