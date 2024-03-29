package irvine.oeis.a126;
// Generated by gen_seq4.pl simgcd at 2023-08-27 22:03

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a079.A079599;

/**
 * A126002 A106486-encodings of combinatorial games whose value is &lt;= 0.
 * @author Georg Fischer
 */
public class A126002 extends AbstractSequence {

  private final AbstractSequence mSeq = new A079599();

  /** Construct the sequence. */
  public A126002() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
