package irvine.oeis.a162;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000041;

/**
 * A162932 a(n) = A053445(n-2) - A053445(n-4).
 * @author Georg Fischer
 */
public class A162932 extends AbstractSequence {

  private final A000041 mSeq1 = new A000041();
  private Z mP4;
  private Z mP3;
  private Z mP2;
  private Z mP1;

  /** Construct the sequence. */
  public A162932() {
    super(6);
    mSeq1.next();
    mSeq1.next();
    mP4 = mSeq1.next();
    mP3 = mSeq1.next();
    mP2 = mSeq1.next();
    mP1 = mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = p(n)-2*p(n-1)+2*p(n-3)-p(n-4), where p(n) = A000041(n).
    final Z p0 = mSeq1.next();
    final Z result = p0.subtract(mP1.multiply2()).add(mP3.multiply2()).subtract(mP4);
    mP4 = mP3;
    mP3 = mP2;
    mP2 = mP1;
    mP1 = p0;
    return result;
  }
}
