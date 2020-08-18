package irvine.oeis.a081;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A081055 Number of partitions of <code>2n</code> in which no parts are multiples of 4.
 * @author Georg Fischer
 */
public class A081055 extends EulerTransform {

  /** Construct the sequence. */
  public A081055() {
    super(new PeriodicSequence(2, 1, 3, 1, 3, 0, 2, 0, 2, 0, 3, 1, 3, 1, 2, 0), 1);
  }
}
