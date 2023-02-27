package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.a013.A013974;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A289024 Exponents a(1), a(2), ... such that E_10, 1 - 264*q - 135432*q^2 + ... (A013974) is equal to (1-q)^a(1) (1-q^2)^a(2) (1-q^3)^a(3) ... .
 * @author Georg Fischer
 */
public class A289024 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A289024() {
    super(1, new A013974(), 1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
