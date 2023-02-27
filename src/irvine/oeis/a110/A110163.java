package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.a004.A004009;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A110163 Exponents a(1), a(2), ... such that theta series of E_8 lattice, 1 + 240 q + 2160 q^2 + ... (A004009) is equal to (1-q)^a(1) (1-q^2)^a(2) (1-q^3)^a(3) ...
 * @author Georg Fischer
 */
public class A110163 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A110163() {
    super(1, new A004009(), 1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().negate();
  }
}
