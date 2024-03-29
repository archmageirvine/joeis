package irvine.oeis.a075;
// Generated by gen_seq4.pl holos [[0],[-84,136,303,-653,357,-59],[-168,338,461,-1531,1195,-295],[0,384,-943,-1411,4719,-2301],[0,96,-50,-270,-6,118]] [1,4,33,356] 0 at 2020-02-15 22:07
// Recurrence: 2*n*(n+1)^2*(59*n^2-121*n+48)*a[n+0]=n*(2301*n^4-4719*n^3+1411*n^2+943*n-384)*a[n-1]+(n-1)*(295*n^4-900*n^3+631*n^2+170*n-168)*a[n-2]+(n-3)*(n-2)*(n-1)*(59*n^2-3*n-14)*a[n-3]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A075132 a(0)=1; for n &gt; 0, a(n)=sum(binomial(n,k)*binomial(n+k,k+1)*binomial(n+k+1,k),k=0..n)/n.
 * @author Georg Fischer
 */
public class A075132 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A075132() {
    super(0, "[[0],[-84,136,303,-653,357,-59],[-168,338,461,-1531,1195,-295],[0,384,-943,-1411,4719,-2301],[0,96,-50,-270,-6,118]]", "[1,4,33,356]", 0);
  }
}
