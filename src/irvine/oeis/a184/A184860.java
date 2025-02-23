package irvine.oeis.a184;
// Generated by gen_seq4.pl 2025-02-18.ack/filnum at 2025-02-18 23:09

import irvine.math.cr.CR;
import irvine.oeis.FilterNumberSequence;

/**
 * A184860 Numbers k such that floor(nr+h) is prime, where r=(1+sqrt(5))/2 and h=1/2.
 * @author Georg Fischer
 */
public class A184860 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A184860() {
    super(1, 1, n -> {
      final CR r = CR.PHI;
      return r.multiply(CR.valueOf(n)).add(CR.HALF).floor().isProbablePrime();
    });
  }
}
