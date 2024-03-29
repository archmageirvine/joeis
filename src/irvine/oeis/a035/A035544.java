package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035544 Number of partitions of n with equal number of parts congruent to each of 1 and 3 (mod 4).
 * @author Georg Fischer
 */
public class A035544 extends A035536 {

  /** Construct the sequence. */
  public A035544() {
    super(0, 4, 1, new int[] { 1, 3 });
  }
  
  @Override
  protected Z total(final int[] cn) {
    return (cn[0] == cn[1] &&  cn[0] >= 0) ? Z.ONE : Z.ZERO;
  }
}
