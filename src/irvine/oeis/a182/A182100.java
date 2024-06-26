package irvine.oeis.a182;
// Generated by gen_seq4.pl andiv 2023-01-11 22:52

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a327.A327078;

/**
 * A182100 The number of connected simple labeled graphs with &lt;= n nodes.
 * @author Georg Fischer
 */
public class A182100 extends AbstractSequence {

  private final A327078 mSeq1 = new A327078();
  private int mN;

  /** Construct the sequence. */
  public A182100() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return mSeq1.next().add(++mN);
  }
}
