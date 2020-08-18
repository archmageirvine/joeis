package irvine.oeis.a035;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A035294 Number of ways to partition <code>2n</code> into distinct positive integers.
 * @author Georg Fischer
 */
public class A035294 extends EulerTransform {

  /** Construct the sequence. */
  public A035294() {
    super(new PeriodicSequence(1, 1, 2, 1, 2, 0, 1, 0, 1, 0, 2, 1, 2, 1, 1, 0), 1);
  }
}
