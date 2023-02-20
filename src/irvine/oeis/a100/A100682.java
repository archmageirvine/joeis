package irvine.oeis.a100;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000332;

/**
 * A100682 Floor of 4th root of pentatope numbers.
 * @author Georg Fischer
 */
public class A100682 extends Sequence0 {

  private final A000332 mSeq = new A000332();

  /** Construct the sequence. */
  public A100682() {
    mSeq.next();
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().root(4);
  }
}
