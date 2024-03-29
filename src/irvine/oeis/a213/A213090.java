package irvine.oeis.a213;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1+(1-3*x-2*x^2-(1-x-2*x^2)*sqrt(1-4*x))/(1-3*x-(1-x+2*x^2)*sqrt(1-4*x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A213090 Number of permutations of length n whose associated Schubert variety is defined by inclusions.
 * @author Georg Fischer
 */
public class A213090 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A213090() {
    super(0, "[[0],[64,192,128],[-5416,-5448,-1328],[9254,8862,1984],[-8230,-9372,-2099],[-267,2511,621],[6087,1836,126],[-3567,-1170,-96],[763,228,17],[-56,-15,-1]]", "[1,1,2,6,23,101,477,2343,11762,59786]", 8);
  }
}
