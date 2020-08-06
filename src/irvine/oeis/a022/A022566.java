package irvine.oeis.a022;
// Generated by gen_seq4.pl sumlino at 2020-08-05 12:42

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a004.A004826;


/**
 * A022566 Numbers that are not the sum of 4 nonnegative cubes.
 * @author Sean A. Irvine
 */
public class A022566 extends ComplementSequence {

  /** Construct the sequence. */
  public A022566() {
    super(new A004826(), Z.ONE);
  }
}  
