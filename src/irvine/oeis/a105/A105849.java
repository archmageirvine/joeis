package irvine.oeis.a105;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-2*x-sqrt((1-6*x+8*x^2-4*x^3)/(1-2*x)))/(2*x^2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A105849 Row sums of number triangle A105848.
 * @author Georg Fischer
 */
public class A105849 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A105849() {
    super(0, "[[0],[32,48,16],[-504,-412,-80],[1896,1098,156],[-3024,-1380,-156],[2288,870,82],[-788,-259,-21],[96,28,2]]", "[1,3,9,28,91,308,1079,3888]", 6);
  }
}
