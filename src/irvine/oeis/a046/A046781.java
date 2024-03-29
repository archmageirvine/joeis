package irvine.oeis.a046;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a035.A035536;


/**
 * A046781 Number of partitions of n with equal nonzero number of parts congruent to each of 1, 2 and 3 (mod 4).
 * @author Georg Fischer
 */
public class A046781 extends A035536 {

  /** Construct the sequence. */
  public A046781() {
    super(0, 4, 1, new int[] { 1, 2, 3 });
  }
  
  @Override
  protected Z total(final int[] cn) {
    return (cn[0] == cn[1] && cn[1] == cn[2] &&  cn[0] >= 1) ? Z.ONE : Z.ZERO;
  }
}
