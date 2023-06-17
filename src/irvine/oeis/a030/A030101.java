package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A030101 a(n) is the number produced when n is converted to binary digits, the binary digits are reversed and then converted back into a decimal number.
 * @author Sean A. Irvine
 */
public class A030101 extends AbstractSequence {

  /* Construct the sequence. */
  public A030101() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    long r = 0;
    long s = ++mN;
    while (s != 0) {
      r <<= 1;
      r |= s & 1;
      s >>>= 1;
    }
    return Z.valueOf(r);
  }
}
