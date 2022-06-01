package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099263 a(n) = (1/40320)*8^n + (1/1440)*6^n + (1/360)*5^n + (1/64)*4^n + (11/180)*3^n + (53/288)*2^n + 103/280. Partial sum of Stirling numbers of second kind S(n,i), i=1..8 (i.e., a(n) = Sum_{i=1..8} S(n,i)).
 * @author Sean A. Irvine
 */
public class A099263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099263() {
    super(new long[] {5760, -14832, 14756, -7504, 2135, -343, 29}, new long[] {1, 2, 5, 15, 52, 203, 877});
  }
}
