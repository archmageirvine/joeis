package irvine.oeis.a101;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A101230 Number of partitions of <code>2n</code> in which both odd parts and parts that are multiples of 3 occur with even multiplicities. There is no restriction on the other even parts.
 * @author Georg Fischer
 */
public class A101230 extends EulerTransform {

  /** Construct the sequence. */
  public A101230() {
    super(new PeriodicSequence(2, 1, 1, 1, 2, 1), 1);
  }
}
