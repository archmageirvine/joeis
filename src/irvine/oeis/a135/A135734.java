package irvine.oeis.a135;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001248;
import irvine.oeis.a046.A046301;

/**
 * A135734 a(n) = prime(n)*prime(n+1)*prime(n+2) - prime(n+3)^2.
 * @author Georg Fischer
 */
public class A135734 extends AbstractSequence {

  private A046301 mSeq1 = new A046301();
  private A001248 mSeq2 = new A001248();

  /** Construct the sequence. */
  public A135734() {
    super(1);
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
