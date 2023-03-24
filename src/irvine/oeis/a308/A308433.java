package irvine.oeis.a308;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a004.A004111;

/**
 * A308433 G.f.: x * (d/dx) x * Product_{k&gt;=1} (1 + x^k)^(a(k)/k).
 * @author Georg Fischer
 */
public class A308433 extends AbstractSequence {

  private int mN = 0;
  private final A004111 mSeq = new A004111();

  /** Construct the sequence. */
  public A308433() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.valueOf(mN).multiply(mSeq.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
