package irvine.oeis.a155;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (sqrt(1-10*x+19*x^2-10*x^3+x^4)-x^2+3*x-1)/(2*x*(x-1))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A155867 A 'Morgan Voyce' transform of the large Schroeder numbers A006318.
 * @author Georg Fischer
 */
public class A155867 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A155867() {
    super(0, "[[0],[0,1,1],[-18,-30,-12],[150,160,40],[-384,-309,-57],[72,142,28],[1452,418,28],[-2994,-831,-57],[2550,640,40],[-918,-210,-12],[90,19,1]]", "[1,3,13,65,355,2061,12501,78323,503033,3294373,21916883]", 9);
  }
}
