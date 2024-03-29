package irvine.oeis.a035;
// Generated by gen_seq4.pl partcond at 2020-09-17 10:00
// DO NOT EDIT here!

import irvine.math.z.Z;


/**
 * A035626 Number of partitions of n into parts 4k+2 and 4k+3 with at least one part of each type.
 * @author Georg Fischer
 */
public class A035626 extends A035679 {

  /** Construct the sequence. */
  public A035626() {
    super(1, 4, 1, new int[] { 2, 3 });
  }
  
  @Override
  protected Z total(final int[] cn) {
    return Z.valueOf(cn[0]).multiply(Z.valueOf(cn[1]));
  }
}
