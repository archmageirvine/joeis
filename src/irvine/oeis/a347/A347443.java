package irvine.oeis.a347;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a027.A027187;
import irvine.oeis.a035.A035363;

/**
 * A347443 Number of integer partitions of n with reverse-alternating product &lt;= 1.
 * @author Georg Fischer
 */
public class A347443 extends AbstractSequence {

  private int mN = -1;
  private final A027187 mSeq1 = new A027187();
  private final A035363 mSeq2 = new A035363();

  /** Construct the sequence. */
  public A347443() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().add((mN == 0) ? Z.ZERO : mSeq2.next());
  }
}
