package irvine.oeis.a078;
// manually at 2022-08-15

import irvine.oeis.recur.HolonomicRecurrence;
/**
 * A078906 Expansion of j in powers of Gamma(5)-modular function Lambda^5.
 * radtorec((x^4-228*x^3+494*x^2+228*x+1)^3/(-x^2-11*x+1)^5)
 * @author Georg Fischer
 */
public class A078906 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A078906() {
    super(-1, "[[0],[-8, 1],[780,-217],[20080,-2015],[-23560, 5890],[3960, 2015],[956,-217],[0,-1]]",
      "[1, 739, 196874, 22478125, 1086128125, 35307387500, 913727546875, 20389341653125, 410010534950000]", -1);
  }
}
