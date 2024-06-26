package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-05-27/holos at 2024-05-28 02:23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A370766 Number of signed permutations of length n with adjacent elements differing by more than 1.
 * 1+2*n)*self.a(n-1) + (1-2*n)*self.a(n-2) + (9-2*n)*self.a(n-3) + (-6+2*n)*self.a(n-4) for n >= 4
 * @author Georg Fischer
 */
public class A370766 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A370766() {
    super(0, "[[0], [-6, 2], [9, -2], [1, -2], [1, 2], [-1]]", "1, 2, 4, 20", 0, 0);
  }
}
