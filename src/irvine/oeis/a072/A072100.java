package irvine.oeis.a072;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1/2*x*(((1+2*x)/(1-2*x))^(1/2)-1))/(1-x)-1
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A072100 Column 2 of the array m(i,1)=m(1,j)=1 m(i,j)=m(i-1,j-1)+m(i-1,j+1) (a(n)=m(n,2)).
 * @author Georg Fischer
 */
public class A072100 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A072100() {
    super(1, "[[0],[0,20,20],[-14,-42,-28],[-48,-25,-1],[70,57,11],[12,-1,-1],[-20,-9,-1]]", "[1,2,3,5,8,14,24]", 5);
  }
}
