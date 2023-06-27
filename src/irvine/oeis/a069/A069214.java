package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069214 Let u(n,k) be the recursion defined by u(n,1)=1, u(n,2)=2, u(n,3)=n, and u(n,k+3) = (u(n,k+2) + u(n,k+1))/u(n,k) if u(n,k) divides u(n,k+2) + u(n,k+1), u(n,k+3) = u(n,k) otherwise. Then u(n,k) is periodic and a(n) = Max(u(n,k), k &gt;= 1).
 * u(n,k+3) = (u(n,k+2) + u(n,k+1))/u(n,k) if u(n,k) divides u(n,k+2) + u(n,k+1), u(n,k+3) = u(n,k) otherwise.
 * Then u(n,k) is periodic and a(n) = Max(u(n,k), k=1, 2, 3, 4,...).
 * @author Georg Fischer
 */
public class A069214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069214() {
    super(1, new long[]{-1, 0, 2, 0}, new long[]{4, 5, 6, 8}, new long[]{5});
  }
}
