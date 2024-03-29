package irvine.oeis.a186;
// Generated by gen_seq4.pl holos [[0],[-693,2796,-3780,2190,-567,54],[1545,-6678,9984,-6534,1944,-216],[993,-4046,5922,-4136,1410,-188],[75,-720,2166,-2646,1296,-216],[0,-120,108,246,-243,54]] [1,1,2,6,20,72] 0 at 2020-03-14 22:45
// Recurrence: 3*(n-2)*n*(2*n-5)*(3*n-2)*(3*n+2)*a[n+0]=3*(2*n-5)*(2*n-1)*(18*n^3-54*n^2+36*n-5)*a[n-1]+(2*n-3)*(94*n^4-564*n^3+1222*n^2-1128*n+331)*a[n-2]+3*(2*n-5)*(2*n-1)*(18*n^3-108*n^2+198*n-103)*a[n-3]-3*(n-3)*(n-1)*(2*n-1)*(3*n-11)*(3*n-7)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186996 G.f. satisfies: A(x) = 1 + x*A(x) + x^2*A(x)^4.
 * @author Georg Fischer
 */
public class A186996 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186996() {
    super(0, "[[0],[-693,2796,-3780,2190,-567,54],[1545,-6678,9984,-6534,1944,-216],[993,-4046,5922,-4136,1410,-188],[75,-720,2166,-2646,1296,-216],[0,-120,108,246,-243,54]]", "[1,1,2,6,20,72]", 0);
  }
}
