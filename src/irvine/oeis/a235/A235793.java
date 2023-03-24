package irvine.oeis.a235;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a015.A015128;

/**
 * A235793 Sum of all parts of all overpartitions of n.
 * @author Georg Fischer
 */
public class A235793 extends AbstractSequence {

  private int mN = 0;
  private final A015128 mSeq = new A015128();

  /** Construct the sequence. */
  public A235793() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mSeq.next());
  }
}
