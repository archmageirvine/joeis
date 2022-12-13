package irvine.oeis.a228;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a007.A007504;

/**
 * A228190 a(n) = sum_{i=1..n} prime(i) + product_{i=1..n} prime(i).
 * @author Georg Fischer
 */
public class A228190 extends AbstractSequence {

  private A002110 mSeq1 = new A002110();
  private A007504 mSeq2 = new A007504();

  /** Construct the sequence. */
  public A228190() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
