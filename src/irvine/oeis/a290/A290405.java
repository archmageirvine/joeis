package irvine.oeis.a290;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a121.A121590;

/**
 * A290405 Expansion of (a(q) / b(q))^3 in powers of q where a(), b() are cubic AGM theta functions.
 * @author Georg Fischer
 */
public class A290405 extends AbstractSequence {

  private int mN = -1;
  private final A121590 mSeq = new A121590();

  /** Construct the sequence. */
  public A290405() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.valueOf(27).multiply(mSeq.next());
  }
}
