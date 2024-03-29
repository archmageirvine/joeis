package irvine.oeis.a104;
// Generated by gen_seq4.pl holos at 2021-05-20 21:38
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A104979 Semidiagonal sums of triangle A104978: a(n) = Sum_{k=0..[n/2]} A104978(n-k,n-2*k).
 * @author Georg Fischer
 */
public class A104979 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A104979() {
    super(0, "[[0],[-76032, 24864,-2688, 96],[-122880, 48128,-6144, 256],[16200,-6444, 840,-36],[-197952, 80872,-11112, 512],[-554904, 252522,-38211, 1923],[-319266, 164541,-27735, 1530],[11010,-107,-1824, 281],[-39960, 41298,-13935, 1527],[-3042, 5847,-3447, 612],[198,-699, 702,-201],[0,-6,-6, 12]]", "[1, 1, 4, 17, 85, 459, 2614, 15454, 93947, 583568]", 0);
  }
}
