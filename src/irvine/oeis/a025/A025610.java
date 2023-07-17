package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025610 Numbers of form 2^i*6^j, with i, j &gt;= 0; equivalently, numbers of the form 2^i*3^j with 0 &lt;= j &lt;= i.
 * @author Sean A. Irvine
 */
public class A025610 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A025610(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A025610() {
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
    mPriority.add(r.multiply(6));
    return r;
  }
}
