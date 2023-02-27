package irvine.oeis.a352;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A352602 a(n) = 4^n*(2^(2*n+1)-1)*(2*n)!.
 * @author Georg Fischer
 */
public class A352602 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A352602() {
    super(0, "[[0],[0,-768,2816,-3072,1024],[0,40,-80],[1]]", "1,56", 0);
  }
}
