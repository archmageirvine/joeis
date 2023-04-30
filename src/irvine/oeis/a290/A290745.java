package irvine.oeis.a290;
// manually verified, 2023-04-29 (Mathar/Howroyd)

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A290745 Maximum number of distinct Lyndon factors that can appear in words of length n over an alphabet of size 10.
 * @author Georg Fischer
 */
public class A290745 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A290745() {
    super(1, "[0,1,-2,1,0,0,0,0,0,0,0,-1,2,-1]", "10,11,13,16,20,25,31,38,46,55,64,74", 0);
  }
}
