package irvine.oeis.a184;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1-x-x^2-sqrt((1-x-x^2)*(1-5*x-x^2))/(2*x*(1-x-x^2))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A184018 Expansion of c(x/(1-x-x^2)) / (1-x-x^2), c(x) the g.f. of A000108.
 * @author Georg Fischer
 */
public class A184018 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A184018() {
    super(0, "[[0],[-6,-3,3],[-84,50,40],[78,559,163],[988,926,162],[-1974,-1263,-181],[-4784,-2076,-218],[3970,1495,135],[2836,782,54],[-3306,-807,-49],[1060,226,12],[-110,-21,-1]]", "[1,2,6,19,67,254,1017,4236,18168,79680,355635,1609912]", 10);
  }
}
