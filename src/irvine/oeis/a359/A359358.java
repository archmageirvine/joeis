package irvine.oeis.a359;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a056.A056239;

/**
 * A359358 Let y be the integer partition with Heinz number n. Then a(n) is the size of the Young diagram of y after removing a rectangle of the same length as y and width equal to the smallest part of y.
 * @author Georg Fischer
 */
public class A359358 extends AbstractSequence {

  private final A056239 mSeq1 = new A056239();
  private final A359360 mSeq2 = new A359360();

  /** Construct the sequence. */
  public A359358() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
