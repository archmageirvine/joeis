package irvine.oeis.a288;

import irvine.math.z.Z;
import irvine.oeis.a008.A008410;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A288471 Exponents a(1), a(2), ... such that E_8, 1 + 480*q + 61920*q^2 + ... (A008410) is equal to (1-q)^a(1) (1-q^2)^a(2) (1-q^3)^a(3) ... .
 * @author Georg Fischer
 */
public class A288471 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A288471() {
    super(1, new A008410(), 1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
