package irvine.oeis.a330;
// manually 2022-08-22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A330966 a(n) is 1/5 times the number of anti-chains of size four in "0,1,2" Motzkin trees on n edges.
 * Recurrence: -(n+2)*(n-6)*a(n) +(n+2)*(4*n-17)*a(n-1) +(2*n^2-n-90)*a(n-2) -3*(n+2)*(4*n-3)*a(n-3) -9*(n+2)*(n+1)*a(n-4)=0.
 * @author Georg Fischer
 */
public class A330966 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A330966() {
    super(6, "[[0],[-18,-27,-9],[18,-15,-12],[-90,-1, 2],[-34,-9, 4],[12, 4,-1]]", "1", 0);
  }
}
