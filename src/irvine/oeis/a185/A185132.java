package irvine.oeis.a185;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A185132 Number of 4-Motzkin paths of length n with no level steps at height 0.
 * @author Georg Fischer
 */
public class A185132 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A185132() {
    // 4*(n+1)*u(n)+(-31*n+17)*u(n-1)+(40*n-92)*u(n-2)+(12*n-24)*u(n-3) = 0
    super(1, "[[0],[-24,12],[-92,40],[17,-31],[4,4]]", "1,0", 1);
  }
}
