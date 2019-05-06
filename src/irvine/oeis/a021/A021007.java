package irvine.oeis.a021;

import irvine.math.z.Z;

/**
 * A021007 Let <code>q_k = p*(p+2)</code> be product of k-th pair of twin primes; sequence gives values of <code>p+2</code> such that <code>(q_k)^2 &gt; q_{k-i}*q_{k+i}</code> for all <code>1 &lt;= i &lt;= k-1</code>.
 * @author Sean A. Irvine
 */
public class A021007 extends A021005 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}

