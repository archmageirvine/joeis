package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;

/**
 * A026122 a(n) is the number of (s(0),s(1),...,s(n)) such that every s(i) is a nonnegative integer, s(0) = 1, s(n) = 1, |s(1) - s(0)| = 1, |s(i) - s(i-1)| &lt;= 1 for i &gt;= 2. Also a(n) = T(n,n), where T is the array in A026120.
 * @author Sean A. Irvine
 */
public class A026122 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026122() {
    super(new A026107());
  }
}
