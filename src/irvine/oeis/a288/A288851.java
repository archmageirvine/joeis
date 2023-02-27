package irvine.oeis.a288;

import irvine.math.z.Z;
import irvine.oeis.a013.A013973;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A288851 Exponents a(1), a(2), ... such that E_6, 1 - 504*q - 16632*q^2 - ... (A013973) is equal to (1-q)^a(1) (1-q^2)^a(2) (1-q^3)^a(3) ... .
 * @author Georg Fischer
 */
public class A288851 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A288851() {
    super(1, new A013973(), 1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
