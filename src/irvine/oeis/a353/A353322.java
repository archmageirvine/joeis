package irvine.oeis.a353;
// manually holsig/holos at 2022-09-30 08:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A353322 A variant of Van Eck&apos;s sequence where we only consider powers of 2: for n &gt;= 0,
 * if a(n) = a(n-2^e) for some e, take the least such e and set a(n+1) = 2^e; otherwise a(n+1) = 0. Start with a(1) = 0.
 * @author Georg Fischer
 */
public class A353322 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A353322() {
    super(1, "[0,1,0,0,0,0,0,0,0,-1]", "0,0,1,0,2,0,2,2,1,0,4,0,2,8,0,0,1,8,4,8,2,8,2,2,1", 0);
  }
}
