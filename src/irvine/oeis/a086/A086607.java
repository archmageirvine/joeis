package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A086607 Main diagonal of triangle A086606: the n-th term of the n-th self-convolution of the sequence formed by flattening triangle A086606.
 * @author Sean A. Irvine
 */
public class A086607 extends AbstractSequence {

  /** Construct the sequence. */
  public A086607() {
    super(1);
  }

  private A086606 mSeq = new A086606();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      mSeq.next();
    }
    return mSeq.next();
  }
}

