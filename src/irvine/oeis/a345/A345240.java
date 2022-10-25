package irvine.oeis.a345;
// manually holsig2/holos at 2022-10-25 21:49

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A345240 a(1) = 1; thereafter a(n) = A161406(a(n-1)).
 * @author Georg Fischer
 */
public class A345240 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A345240() {
    super(1, "[0,1,0,0,0,0,-1]", "1,52,158,229,278,284,304,235,289,291,300,153,251,298", 0);
  }
}
