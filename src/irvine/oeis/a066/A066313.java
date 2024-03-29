package irvine.oeis.a066;
// Generated by gen_seq4.pl deris/moebiusx at 2022-03-25 23:07

import irvine.oeis.a053.A053656;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A066313 Number of aperiodic necklaces with n red or blue beads such that two necklaces are equivalent under the operation of simultaneously turning the necklace over and switching the two colors.
 * @author Georg Fischer
 */
public class A066313 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A066313() {
    super(new A053656(), 0);
    next();
  }
}
