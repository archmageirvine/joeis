package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056788 a(n) = n^n + (n-1)^(n-1).
 * @author Georg Fischer
 */
public class A056788 extends AbstractSequence {

  protected int mN;

  /** Construct the sequence. */
  public A056788() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    final Z pow1 = Z.valueOf(mN).pow(mN);
    ++mN;
    return pow1.add(Z.valueOf(mN).pow(mN));
  }
}
