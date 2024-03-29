package irvine.oeis.a104;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-2*x+2*x^2-sqrt(1-8*x+16*x^2-12*x^3+4*x^4))/(2*x*(1-x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A104547 Number of Schroeder paths of length 2n having no UHD, UHHD, UHHHD, ..., where U=(1,1), D=(1,-1), H=(2,0).
 * @author Georg Fischer
 */
public class A104547 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A104547() {
    super(0, "[[0],[0,8,8],[-108,-164,-56],[864,764,164],[-2442,-1594,-256],[2790,1560,210],[-72,-320,-56],[-2760,-703,-43],[2466,621,39],[-828,-191,-11],[90,19,1]]", "[1,2,5,16,60,245,1051,4660,21174,98072,461330]", 9);
  }
}
