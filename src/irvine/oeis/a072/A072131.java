package irvine.oeis.a072;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A072131 T_7(n) in the notation of Bergeron et al., u_k(n) in the notation of Gessel: Related to Young tableaux of bounded height.
 * @author Georg Fischer
 */
public class A072131 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A072131() {
    super(1, "[[0],[-396900, 1455300,-2127825, 1587600,-639450, 132300,-11025],[399000,-855832, 324910, 355304,-244094, 7796, 12916],[-82425,-242990, 520015,-17696,-142542,-32388,-1974],[-343035, 429858, 634756, 238440, 38958, 2940, 84],[-518400,-362880,-103824,-15552,-1288,-56,-1]]", "1, 2, 6, 24", 0);
  }
}
