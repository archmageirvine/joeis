package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134186 A 3 person 9 X 9 Markov approach to a zero sum game where: Sum[game_value(MAi),{i,1,3}]=0 and two of the games are minimal Pisot vector Markovs and the third is a negative Fibonacci: Characteristic Polynomial: -1 + 3 x^2 + 3 x^3 - 4 x^4 - 5 x^5 + x^6 + 4 x^7 - x^9; MA1={{0,1,0},{,0,0,1},{1,1,0}};Det=1 ;gv=-1/4; MA2={{0,1,1},{1,0,0},{0,1,0}};Det=1;gv=-1/4 MA2={{0,0,1},{0,1,0},{1,0,-1}};Det=-1;gv=1/2.
 * @author Sean A. Irvine
 */
public class A134186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134186() {
    super(new long[] {-1, 0, 2, 2, -1}, new long[] {4, 3, 5, 4, 7});
  }
}
