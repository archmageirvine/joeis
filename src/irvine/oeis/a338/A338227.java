package irvine.oeis.a338;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007590;
import irvine.oeis.a049.A049472;

/**
 * A338227 a(n) = x(n) mod floor(sqrt(x(n))), where x(n) = floor((n^2)/2).
 * @author Georg Fischer
 */
public class A338227 extends AbstractSequence {

  private A007590 mSeq1 = new A007590();
  private A049472 mSeq2 = new A049472();

  /** Construct the sequence. */
  public A338227() {
    super(2);
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().mod(mSeq2.next());
  }
}
