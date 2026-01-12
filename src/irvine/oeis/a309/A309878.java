package irvine.oeis.a309;
// manually 2026-01-07/holos at 2026-01-07 19:24

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A309878 The real part of b(n) where b(n) = (n + b(n-1)) * (1 + i) with b(-1)=0; i = sqrt(-1).
 * EX=xx
 * @author Georg Fischer
 */
public class A309878 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A309878() {
    super(0, "[[0],[2],[-6],[7],[-4],[1]]", "0,1,2", 0, 0);
  }
}
