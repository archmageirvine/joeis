package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A087666 Consider recurrence b(0) = n/3, b(k+1) = b(k)*floor(b(k)); a(n) is the least k such that b(k) is an integer, or -1 if no integer is ever reached.
 * @author Sean A. Irvine
 */
public class A087666 extends AbstractSequence {

  private long mN = 5;

  /** Construct the sequence. */
  public A087666() {
    super(6);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    Z x = Z.valueOf(mN);
    Z[] qr = x.divideAndRemainder(3);
    while (!qr[1].isZero()) {
      x = x.multiply(qr[0]);
      ++cnt;
      qr = x.divideAndRemainder(3);
    }
    return Z.valueOf(cnt);
  }
}
