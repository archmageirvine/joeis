package irvine.oeis.a290;
// manually verified, 2023-04-29 (Mathar/Howroyd)

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A290743 Maximum number of distinct Lyndon factors that can appear in words of length n over an alphabet of size 2.
 * @author Georg Fischer
 */
public class A290743 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A290743() {
    super(1, "[0,1,-2,0,2,-1]", "2,3,4,6", 0);
  }
}
