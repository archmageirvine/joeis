package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025622 Numbers of form 5^i*6^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025622 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A025622(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A025622() {
    super(1);
  }

  private final TreeSet<Z> mPriority = new TreeSet<>();

  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(5));
    mPriority.add(r.multiply(6));
    return r;
  }
}
