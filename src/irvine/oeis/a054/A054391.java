package irvine.oeis.a054;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: 1-(2*x^2)/(2*x^2-3*x+1-sqrt(1-2*x-3*x^2))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A054391 Number of permutations with certain forbidden subsequences.
 * @author Georg Fischer
 */
public class A054391 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A054391() {
    super(0, "[[0],[72,108,36],[-192,-288,-96],[-154,111,79],[1148,684,100],[-1350,-852,-126],[-218,45,17],[938,288,22],[-420,-123,-9],[56,15,1]]", "[1,1,2,5,14,41,123,374,1147,3538]", 8);
  }
}
