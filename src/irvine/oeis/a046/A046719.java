package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006879;

/**
 * A046719 Total number of digits in all primes with n digits.
 * @author Sean A. Irvine
 */
public class A046719 extends AbstractSequence {

  private A006879 mSeq = new A006879();
  private long mN = 0;

  /** Construct the sequence. */
  public A046719() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().multiply(++mN);
  }
}
