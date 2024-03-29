package irvine.oeis.a214;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;


/**
 * A214284 Characteristic function of squares or five times squares.
 * @author Georg Fischer
 */
public class A214284 extends EulerTransform {

  /** Construct the sequence. */
  public A214284() {
    super(new PeriodicSequence(1, -1, 0, 1, 0, 0, 0, -1, 1, -1, 1, -1, 0, 0, 0, 1, 0, -1, 1, -1), 1);
  }
}
