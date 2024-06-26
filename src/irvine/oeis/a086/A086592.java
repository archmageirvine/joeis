package irvine.oeis.a086;
// Generated by gen_seq4.pl anopan 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a020.A020650;
import irvine.oeis.a020.A020651;

/**
 * A086592 Denominators in left-hand half of Kepler's tree of fractions.
 * @author Georg Fischer
 */
public class A086592 extends AbstractSequence {

  private final A020650 mSeq1 = new A020650();
  private final A020651 mSeq2 = new A020651();

  /** Construct the sequence. */
  public A086592() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
