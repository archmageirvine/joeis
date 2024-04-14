package irvine.oeis.a103;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A103160 a(n) = GCD(reverse(n!), reverse((n+1)!)).
 * @author Georg Fischer
 */
public class A103160 extends AbstractSequence {

  private int mN;
  private Z mF;

  /** Construct the sequence. */
  public A103160() {
    super(1);
    mN = 1;
    mF = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    final Z f1 = mF.multiply(mN);
    final Z result = Functions.REVERSE.z(mF).gcd(Functions.REVERSE.z(f1));
    mF = f1;
    return result;
  }
}
