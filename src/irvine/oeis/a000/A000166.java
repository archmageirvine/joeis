package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000166 Subfactorial or rencontres numbers, or derangements: number of permutations of n elements with no fixed points.
 * @author Sean A. Irvine
 */
public class A000166 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000166(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000166() {
    super(0);
  }

  protected int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mA = mA.multiply(mN).add((mN & 1) == 0 ? 1 : -1);
    }
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    // a(n) = n!*Sum_{k=0..n} (-1)^k/k!.
    return Rationals.SINGLETON.sum(0, n, k -> new Q(Z.NEG_ONE.pow(k), Functions.FACTORIAL.z(k))).multiply(Functions.FACTORIAL.z(n)).num();
  }

}

