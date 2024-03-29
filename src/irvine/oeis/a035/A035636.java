package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035636 Number of partitions of n into parts 5k+3 and 5k+4 with at least one part of each type.
 * @author Georg Fischer
 */
public class A035636 extends A035679 {

  /** Construct the sequence. */
  public A035636() {
    super(1, 5, 1, new int[] { 3, 4 });
  }
  
  @Override
  protected Z total(final int[] cn) {
    return Z.valueOf(cn[0]).multiply(Z.valueOf(cn[1]));
  }
}
