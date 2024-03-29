package irvine.oeis.a339;
// Generated by gen_seq4.pl 2023-10-21/pairtra at 2023-10-22 21:59

import irvine.oeis.a024.A024940;
import irvine.oeis.a292.A292518;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A339375 Number of partitions of n into an even number of distinct triangular numbers.
 * @author Georg Fischer
 */
public class A339375 extends PairTransformSequence {

  /** Construct the sequence. */
  public A339375() {
    super(0, new A024940(), new A292518(), (n, u, v) -> u.add(v).divide2());
  }
}
