package irvine.oeis.a021;

import irvine.math.z.Z;

/**
 * A021007 Let q_k = p*(p+2) be product of k-th pair of twin primes; sequence gives values of p+2 such that (q_k)^2 &gt; q_{k-i}*q_{k+i} for all 1 &lt;= i &lt;= k-1.
 * @author Sean A. Irvine
 */
public class A021007 extends A021005 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}

