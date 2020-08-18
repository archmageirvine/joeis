package irvine.oeis.a112;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A112608 Number of representations of n as a sum of a twice a square and three times a triangular number.
 * @author Georg Fischer
 */
public class A112608 extends EulerTransform {

  /** Construct the sequence. */
  public A112608() {
    super(new PeriodicSequence(0, 2, 1, -3, 0, 1, 0, -1, 1, 2, 0, -4, 0, 2, 1, -1, 0, 1, 0, -3, 1, 2, 0, -2), 1);
  }
}
