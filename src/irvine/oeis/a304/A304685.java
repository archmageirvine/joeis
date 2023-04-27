package irvine.oeis.a304;

import irvine.math.z.Z;
import irvine.oeis.a000.A000699;

/**
 * A304685 a(n) = A000699(n) (mod 3).
 * @author Georg Fischer
 */
public class A304685 extends A000699 {

  private final A000699 mSeq = new A000699();

  /** Construct the sequence. */
  public A304685() {
    setOffset(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().mod(Z.THREE);
  }
}
