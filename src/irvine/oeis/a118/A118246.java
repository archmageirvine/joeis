package irvine.oeis.a118;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A118246 Number of partitions of n such that even parts occur at most once and odd parts occur at most twice.
 * @author Georg Fischer
 */
public class A118246 extends EulerTransform {

  /** Construct the sequence. */
  public A118246() {
    super(new PeriodicSequence(1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0), 1);
  }
}
