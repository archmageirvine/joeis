package irvine.oeis.a003;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003586 3-smooth numbers: numbers of the form 2^i*3^j with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A003586 extends AbstractSequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003586(final int offset) {
    super(offset);
    mPriority.add(Z.ONE);
  }

  /** Construct the sequence. */
  public A003586() {
    this(1);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply2());
    mPriority.add(r.multiply(3));
    return r;
  }
}
