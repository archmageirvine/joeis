package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025618 Numbers of form 4^i*6^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025618 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A025618(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A025618() {
    super(1);
  }

  private final TreeSet<Z> mPriority = new TreeSet<>();

  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(4));
    mPriority.add(r.multiply(6));
    return r;
  }
}
