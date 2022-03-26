package irvine.oeis.a085;

import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A085097 Ramanujan sum c_n(3).
 * @author Georg Fischer
 */
public class A085097 implements Sequence {

  private int mN;
  private int mM;

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
    final long g = mN / LongUtils.gcd(mN, mM);
    return Z.valueOf(LongUtils.phi(mN) * Mobius.mobius(g) / LongUtils.phi(g));
  }
}
