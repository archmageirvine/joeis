package irvine.oeis.a331;
// Generated by gen_seq4.pl 2024-07-16/distinct at 2024-07-16 22:37

import irvine.oeis.DistinctSequence;
import irvine.oeis.a055.A055945;

/**
 * A331632 Distinct values of A055945 in order of their appearance as n grows.
 * @author Georg Fischer
 */
public class A331632 extends DistinctSequence {

  /** Construct the sequence. */
  public A331632() {
    super(1, new A055945());
  }
}
