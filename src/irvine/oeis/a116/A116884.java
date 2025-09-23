package irvine.oeis.a116;
// manually 2025-09-23

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a173.A173348;

/**
 * A116884 Integers k such that 0 &lt; |k^5 - m^2| &lt;= k^(3/2) for some integer m.
 * @author Georg Fischer
 */
public class A116884 extends AbstractSequence {

  private final Sequence mSeq = new A173348(1, 2, 5).prepend(1);

  /** Construct the sequence. */
  public A116884() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
