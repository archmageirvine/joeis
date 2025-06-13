package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384777 Square array A(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals downwards, where column k is the expansion of B(x)^k, where B(x) is the g.f. of A382450.
 * @author Sean A. Irvine
 */
public class A384777 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384777() {
    super(2851130928467L, 0, 1000000000000000L);
    //System.out.println("Period: " + computePeriod());
  }
}
