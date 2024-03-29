package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035577 Number of partitions of n with equal number of parts congruent to each of 0, 3 and 4 (mod 5).
 * @author Georg Fischer
 */
public class A035577 extends A035536 {

  /** Construct the sequence. */
  public A035577() {
    super(0, 5, 1, new int[] { 0, 3, 4 });
  }
  
  @Override
  protected Z total(final int[] cn) {
    return (cn[0] == cn[1] && cn[1] == cn[2] &&  cn[0] >= 0) ? Z.ONE : Z.ZERO;
  }
}
