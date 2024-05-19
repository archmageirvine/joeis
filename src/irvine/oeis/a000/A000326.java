package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A000326 Pentagonal numbers: a(n) = n*(3*n-1)/2.
 * @author Sean A. Irvine
 */
public class A000326 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000326(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000326() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.PENTAGONAL.z(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.PENTAGONAL.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.PENTAGONAL.z(n);
  }
}

