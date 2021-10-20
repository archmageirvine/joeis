package irvine.oeis.a147;
// manually 2021-10-19

import irvine.oeis.triangle.Triangle;

/**
 * A147644 Triangle read by rows: t(n,m)=Binomial[n, m] + If[n &gt; 2, 2*Binomial[n - 2, m - 1], 0]; Mod[If[n &gt; 2, 2*Binomial[n - 2, m - 1], 0],2]=0.
 * @author Georg Fischer
 */
public class A147644 extends Triangle {

  /** Construct the sequence. */
  public A147644() {
    super("1, 1, 1, 1, 2, 1, 1, 5, 5, 1");
  }
}

