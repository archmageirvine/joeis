package irvine.oeis.a274;
// Generated by gen_seq4.pl holgrep/holos at 2023-05-08 18:43

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A274785 Diagonal of the rational function 1/(1-(w*x*y*z + w*x*z + w*y + x*y + z)).
 * @author Georg Fischer
 */
public class A274785 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A274785() {
    super(0, "[[0],[27,-108,144,-82,21,-2],[-55,242,-368,242,-72,8],[-1887,8602,-14094,10632,-3750,500],[-5,32,-82,98,-48,8],[0,0,0,-10,9,-2]]", "1,1,25,121,2881,23521,484681,5223625,97949041,1243490161", 0);
  }
}
