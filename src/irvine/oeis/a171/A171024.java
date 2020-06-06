package irvine.oeis.a171;
// Generated by gen_seq4.pl digexch a000 A000040 10 5 1 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A171024 In the sequence of prime numbers, replace all the <code>'5'</code> digits with <code>'1'</code> and vice versa.
 * @author Georg Fischer
 */
public class A171024 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace("5", "a")
        .replace("1", "5")
        .replace("a", "1"), 10);
  }

}
