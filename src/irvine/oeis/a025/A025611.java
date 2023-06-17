package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025611 Numbers of form 2^i*9^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025611 extends AbstractSequence {

  /** Construct the sequence. */
  public A025611() {
    super(1);
  }

  private final TreeSet<Z> mPriority = new TreeSet<>();

  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply2());
    mPriority.add(r.multiply(9));
    return r;
  }
}
