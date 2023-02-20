package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a059.A059348;

/**
 * A104722 Self-convolution of repeated Catalan numbers.
 * @author Georg Fischer
 */
public class A104722 extends Sequence0 {

  private int mN = -1;
  private final A059348 mSeq = new A059348();

  /** Construct the sequence. */
  public A104722() {
    mSeq.next();
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq.next();
  }
}
