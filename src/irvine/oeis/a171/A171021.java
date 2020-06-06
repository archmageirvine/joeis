package irvine.oeis.a171;
// Generated by gen_seq4.pl digexch a000 A000040 10 4 2 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A171021 In the sequence of prime numbers, replace all the <code>'4'</code> digits with <code>'2'</code> and vice versa.
 * @author Georg Fischer
 */
public class A171021 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace("4", "a")
        .replace("2", "4")
        .replace("a", "2"), 10);
  }

}
