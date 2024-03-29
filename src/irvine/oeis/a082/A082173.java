package irvine.oeis.a082;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1+10*x-sqrt(100*x^2-24*x+1))/(22*x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A082173 a(0)=1; for n &gt;= 1, a(n) = Sum_{k=0..n} 11^k*N(n,k) where N(n,k) = (1/n)*C(n,k)*C(n,k+1) are the Narayana numbers (A001263).
 * @author Georg Fischer
 */
public class A082173 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082173() {
    super(0, "[[0],[0,1000,1000],[-660,-1000,-340],[210,172,34],[-12,-7,-1]]", "[1,1,12,155,2124]", 3);
  }
}
