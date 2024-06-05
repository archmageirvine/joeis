package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085097 Ramanujan sum c_n(3).
 * @author Georg Fischer
 */
public class A085097 extends Sequence1 {

  private int mN;
  private final int mM;

  /** Construct the sequence. */
  public A085097() {
    this(3);
  }

  /**
   * Generic constructor with parameter
   * @param m parameter m
   */
  public A085097(final int m) {
    mN = 0;
    mM = m;
  }

  @Override
  public Z next() {
    ++mN;
    final long g = mN / Functions.GCD.l(mN, mM);
    return Z.valueOf(Functions.PHI.l(mN) * Functions.MOBIUS.i(g) / Functions.PHI.l(g));
  }
}
