package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-06-09/holos at 2024-06-09 23:02

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A372324 Expansion of e.g.f. arcsin(x)^2/(2*(1 - x)).
 * Recurrence: a(n)-n*a(n-1)-(n-2)^2*a(n-2)+(n-2)^3*a(n-3)=0
 * @author Georg Fischer
 */
public class A372324 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A372324() {
    super(0, "[[0], [-8, 12, -6, 1], [-4, 4, -1], [0, -1], [1]]", "[0, 0, 1, 3]", 0, 0);
  }
}
