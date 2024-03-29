package irvine.oeis.a126;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: ((1-x)*(1-sqrt(1-4*x)))/(2*x*(1-2*x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A126221 a(n)=c(n)+c(n-1)+2*c(n-2)+4*c(n-3)+8*c(n-4)+...+2^(n-2)*c(1)+2^(n-1)*c(0), where c(k) are the Catalan numbers (A000108).
 * @author Georg Fischer
 */
public class A126221 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126221() {
    super(0, "[[0],[4,12,8],[-74,-84,-22],[180,123,21],[-112,-60,-8],[20,9,1]]", "[1,2,5,13,35,98]", 4);
  }
}
