package irvine.oeis.a171;
// Generated by gen_seq4.pl digexch a000 A000040 10 7 0 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A171034 In the sequence of prime numbers, replace all the <code>'7'</code> digits with <code>'0'</code> and vice versa.
 * @author Georg Fischer
 */
public class A171034 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace("7", "a")
        .replace("0", "7")
        .replace("a", "0"), 10);
  }

}
