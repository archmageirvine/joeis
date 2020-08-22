package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;

/**
 * A026123 a(n) = number of (s(0),s(1),...,s(n)) such that every s(i) is a nonnegative integer, s(0) = 1, s(n) = 2, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2. Also a(n) = T(n,n-1), where T is the array in A026120; a(n) = U(n,n+1), where U is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026123 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026123() {
    super(new A026134());
  }
}
