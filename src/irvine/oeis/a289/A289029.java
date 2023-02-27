package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.a058.A058550;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A289029 Exponents a(1), a(2), ... such that E_14, 1 - 24*q - 196632*q^2 + ... (A058550) is equal to (1-q)^a(1) (1-q^2)^a(2) (1-q^3)^a(3) ... .
 * @author Georg Fischer
 */
public class A289029 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A289029() {
    super(1, new A058550(), 1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
