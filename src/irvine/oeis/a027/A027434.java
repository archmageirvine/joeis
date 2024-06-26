package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027434 a(1) = 2; then defined by property that a(n) = smallest number &gt;= a(n-1) such that successive runs have lengths 1,1,2,2,3,3,4,4.
 * @author Sean A. Irvine
 */
public class A027434 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027434(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A027434() {
    super(1);
  }

  private long mN = -3;

  @Override
  public Z next() {
    mN += 4;
    return Z.ONE.add(Functions.SQRT.l(mN));
  }
}
