package irvine.oeis.a163;
// Generated by gen_seq4.pl digexch a001 A001477 4 2 3 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A163241 Simple self-inverse permutation: Write n in base 4, then replace each digit '2' with '3' and vice versa, then convert back to decimal.
 * @author Georg Fischer
 */
public class A163241 extends A001477 {

  @Override
  public Z next() {
    return new Z(super.next().toString(4)
        .replace('2', 'a')
        .replace('3', '2')
        .replace('a', '3'), 4);
  }

}
