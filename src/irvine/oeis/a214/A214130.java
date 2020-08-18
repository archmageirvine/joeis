package irvine.oeis.a214;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A214130 Partitions of n into parts congruent to <code>+-2, +-3 (mod 13)</code>.
 * @author Georg Fischer
 */
public class A214130 extends EulerTransform {

  /** Construct the sequence. */
  public A214130() {
    super(new PeriodicSequence(0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0), 1);
  }
}
