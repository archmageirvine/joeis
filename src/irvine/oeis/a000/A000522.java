package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000522 Total number of ordered k-tuples (k=0..n) of distinct elements from an n-element set: a(n) = Sum_{k=0..n} n!/k!.
 * @author Sean A. Irvine
 */
public class A000522 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000522(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000522() {
    super(0);
  }

  private Z mA = Z.ZERO;
  private int mN = -1;

  @Override
  public Z next() {
    mA = mA.multiply(++mN).add(1);
    return mA;
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Integers.SINGLETON.sum(0, n, k -> Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(k)));
  }

}
