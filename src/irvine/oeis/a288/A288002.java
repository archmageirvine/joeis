package irvine.oeis.a288;
// Generated by gen_seq4.pl 2023-10-21/pairtra at 2023-10-22 21:59

import irvine.oeis.a007.A007306;
import irvine.oeis.a287.A287896;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A288002 L-fusc, sequence l of the mutual diatomic recurrence pair: l(1)=0, r(1)=1, l(2n) = l(n), r(2n) = r(n), l(2n+1) = l(n)+r(n), r(2n+1) = l(n+1)+r(n+1), where r(n) = A288003(n).
 * @author Georg Fischer
 */
public class A288002 extends PairTransformSequence {

  /** Construct the sequence. */
  public A288002() {
    super(1, new A007306().skip(1), new A287896(), (n, u, v) -> u.subtract(v));
  }
}
