package irvine.oeis.a051;
// Generated by gen_seq4.pl divmul at 2021-08-20 23:57

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a014.A014733;

/**
 * A051476 (Terms in A014733)/4.
 * @author Georg Fischer
 */
public class A051476 extends AbstractSequence {

  private final A014733 mSeq1 = new A014733();

  /** Construct the sequence. */
  public A051476() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(4);
  }
}
