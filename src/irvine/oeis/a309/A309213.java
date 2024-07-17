package irvine.oeis.a309;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007318;
import irvine.oeis.a049.A049310;
import irvine.oeis.a065.A065941;

/**
 * A309213 A007318 + A065941 - A049310.
 * @author Georg Fischer
 */
public class A309213 extends AbstractSequence {

  private final A007318 mSeq1 = new A007318();
  private final A065941 mSeq2 = new A065941();
  private final A049310 mSeq3 = new A049310();

  /** Construct the sequence. */
  public A309213() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next()).subtract(mSeq3.next());
  }
}
