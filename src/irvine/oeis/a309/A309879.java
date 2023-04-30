package irvine.oeis.a309;
// manually verified, 2023-04-29

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A309879 Number of odd parts appearing among the fourth largest parts of the partitions of n into 5 parts.
 * @author Georg Fischer
 */
public class A309879 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A309879() {
    super(0, "[0,-1,2,-1,1,-2,1,0,0,1,-2,2,-3,3,-2,2,-1,0,0,-1,2,-1,1,-2,1]", "0,0,0,0,0,1,1,2,3,4,5,7,8,11,14,18,22,28,33,40,47,56,65", 0);
  }
}
