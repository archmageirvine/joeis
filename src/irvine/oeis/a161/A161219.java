package irvine.oeis.a161;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000031;

/**
 * A161219 a(n) = (1/n) * Sum_{d|n} phi(n/d)*2^(d+1).
 * @author Georg Fischer
 */
public class A161219 extends AbstractSequence {

  private int mN = 0;
  private final A000031 mSeq = new A000031();

  /** Construct the sequence. */
  public A161219() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mSeq.next());
  }
}
