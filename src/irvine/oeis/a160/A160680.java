package irvine.oeis.a160;
// Generated by gen_seq4.pl simbinom at 2023-03-17 21:33

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A160680 a(n) = sigma_0(F(n-1)) + sigma_0(F(n-2)) where F=A000045 and sigma_0=A000005.
 * @author Georg Fischer
 */
public class A160680 extends AbstractSequence {

  private int mN = 2;

  /** Construct the sequence. */
  public A160680() {
    super(3);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.SIGMA0.z(Functions.FIBONACCI.z(mN - 1)).add(Functions.SIGMA0.z(Functions.FIBONACCI.z(mN - 2)));
  }
}
