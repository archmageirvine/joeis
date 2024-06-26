package irvine.oeis.a259;
// Generated by gen_seq4.pl holos [[0],[0,-1500,3875,-3375,1125,-125],[0,-2700,8100,-7800,3000,-400],[60,-1470,4720,-5280,2460,-410],[24,-192,570,-780,486,-108],[0,-6,9,51,-81,27]] [1,1,2,8,35] 0 at 2020-02-15 22:07
// Recurrence: 3*(n-2)*(n-1)*n*(3*n-1)*(3*n+1)*a[n+0]=6*(n-2)*(n-1)*(2*n-1)*(3*n-2)*(3*n-1)*a[n-1]+10*(n-2)*(41*n^4-164*n^3+200*n^2-72*n+3)*a[n-2]+100*(n-3)*n*(2*n-3)*(2*n^2-6*n+3)*a[n-3]+125*(n-4)*(n-3)*(n-1)^2*n*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A259757 G.f. A(x) satisfies A(x)^2 = 1 +x + x*A(x)^5.
 * @author Georg Fischer
 */
public class A259757 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A259757() {
    super(0, "[[0],[0,-1500,3875,-3375,1125,-125],[0,-2700,8100,-7800,3000,-400],[60,-1470,4720,-5280,2460,-410],[24,-192,570,-780,486,-108],[0,-6,9,51,-81,27]]", "[1,1,2,8,35]", 0);
  }
}
