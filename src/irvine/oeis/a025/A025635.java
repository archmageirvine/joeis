package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025635 Numbers of form 9^i*10^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025635 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A025635(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A025635() {
    super(1);
  }

  private final TreeSet<Z> mPriority = new TreeSet<>();

  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(9));
    mPriority.add(r.multiply(10));
    return r;
  }
}
