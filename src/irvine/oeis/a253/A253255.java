package irvine.oeis.a253;
// Generated by gen_seq4.pl holos at 2024-02-09 22:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A253255 G.f. satisfies: A(x) = (1 - x^3*A(x)^3)^2 / (1 - x*A(x))^4.
 * G.f.A(x) satisfies -A+(-A^3*x^3+1)^2/(-A*x+1)^4=0
 * @author Georg Fischer
 */
public class A253255 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A253255() {
    super(0, "[[0], [25920, -49248, 34272, -10368, 1152], [50760, -113436, 92124, -32016, 3984], [0, 3264, -6856, 6364, -2416], [0, 102, -13, 202, 317], [0, -12, -42, -42, -12]]", "1, 4, 26, 202, 1731, 15780", 0, 0);
  }
}
