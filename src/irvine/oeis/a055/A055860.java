package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000169;

/**
 * A055860 a(n) = A000169(n+1) if n &gt; 0; a(0) = 0.
 * @author Georg Fischer
 */
public class A055860 extends Sequence0 {

  protected int mN;
  private final A000169 mSeq = new A000169();

  /** Construct the sequence. */
  public A055860() {
    mN = -1;
    mSeq.next();
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : mSeq.next();
  }
}
