package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A059798 Primes p such that |p - q| is a square, where q is the reversal of p.
 * @author Sean A. Irvine
 */
public class A059798 extends FilterSequence {

  /** Construct the sequence. */
  public A059798() {
    super(new A000040(), k -> {
      final Z s = ZUtils.reverse(k).subtract(k).abs();
      return !s.isZero() && s.isSquare();
    });
  }
}
