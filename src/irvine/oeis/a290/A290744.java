package irvine.oeis.a290;
// manually verified, 2023-04-29 (Mathar/Howroyd)

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A290744 Maximum number of distinct Lyndon factors that can appear in words of length n over an alphabet of size 5.
 * @author Georg Fischer
 */
public class A290744 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A290744() {
    super(1, "[0,1,-2,1,0,0,-1,2,-1]", "5,6,8,11,15,19,24", 0);
  }
}
