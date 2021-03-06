package irvine.oeis.a035;
// Generated by gen_seq4.pl digexch a001 A001477 10 1 2 at 2020-06-05 15:16
// DO NOT EDIT here!                 rseq   rseqno   base     dig1     dig2

import irvine.math.z.Z;
import irvine.oeis.a001.A001477;

/**
 * A035043 Replace any decimal digit '1' with '2' and vice versa.
 * @author Georg Fischer
 */
public class A035043 extends A001477 {

  @Override
  public Z next() {
    return new Z(super.next().toString(10)
        .replace('1', 'a')
        .replace('2', '1')
        .replace('a', '2'), 10);
  }

}
