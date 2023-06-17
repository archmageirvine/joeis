package irvine.oeis.a003;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003595 Numbers of the form 5^i*7^j with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A003595 extends AbstractSequence {

  /** Construct the sequence. */
  public A003595() {
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
    mPriority.add(r.multiply(7));
    return r;
  }
}
