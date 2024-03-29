package irvine.oeis.a128;
// Generated by gen_seq4.pl holos at 2021-06-07 19:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A128748 Number of peaks at height &gt;1 in all skew Dyck paths of semilength n.
 * radtorec(1/2*(1-4*x+2*x^2+x^3-(x^2-x+1)*(5*x^2-6*x+1)^(1/2))/x/(2-x)/(5*x^2-6*x+1)^(1/2))
 * @author Georg Fischer
 */
public class A128748 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A128748() {
    super(1, "[[0],[300,-135, 15],[-1184, 648,-88],[1442,-1061, 187],[-556, 682,-174],[8,-148, 68],[16, 8,-8]]", "0, 2, 11, 54, 260, 1247, 5982, 28741, 138364, 667488, 3226503", 0);
  }
}
