package irvine.oeis.a045;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A045836 Half of Theta series of b.c.c. lattice with respect to long edge.
 * @author Georg Fischer
 */
public class A045836 extends EulerTransform {

  /** Construct the sequence. */
  public A045836() {
    super(new PeriodicSequence(2, -3, 2, 1, 2, -3, 2, -3), 1);
  }
}
