package irvine.oeis.a065;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a053.A053507;

/**
 * A065513 Number of endofunctions of [n] with a cycle a-&gt;b-&gt;c-&gt;a and for all x in [n], some iterate f^k(x)=a.
 * @author Georg Fischer
 */
public class A065513 extends AbstractSequence {

  private int mN = 2;
  private final A053507 mSeq = new A053507();

  /** Construct the sequence. */
  public A065513() {
    super(3);
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mSeq.next());
  }
}
