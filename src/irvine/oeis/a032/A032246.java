package irvine.oeis.a032;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A032246 "DHK[ 5 ]" (bracelet, identity, unlabeled, 5 parts) transform of 1,1,1,1,...
 * @author Georg Fischer
 */
public class A032246 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A032246() {
    super(8, "[0,-1, 2, 1,-4, 1, 3,-3,-1, 4,-1,-2, 1]", "[2, 4, 10, 16, 28, 42, 64, 90, 126, 168, 224]", 0);
  }
}
