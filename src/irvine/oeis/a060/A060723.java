package irvine.oeis.a060;
// Generated by gen_seq4.pl 2025-07-15.ack/conum at 2025-07-15 23:51

import irvine.math.z.Z;
import irvine.oeis.a305.A305491;

/**
 * A060723 a(n) is the denominator of r(n) where r(n) is the sequence of rational numbers defined by the recursion: r(0) = 0, r(1) = 1 and for n&gt;1 r(n) = r(n-1) + r(n-2)/2. From this definition it is clear that a(n) is always a power of 2 (see A060755).
 * Numerator is A305491
 * @author Georg Fischer
 */
public class A060723 extends A305491 {

  @Override
  public Z next() {
    return super.nextQ().den();
  }
}
