package irvine.oeis.a184;
// Generated by gen_seq4.pl A183953/parm2 at 2022-05-13 20:53

import irvine.oeis.a183.A183953;

/**
 * A184848 T(n,k)=Number of strings of numbers x(i=1..n) in 0..k with sum i*x(i)^4 equal to n*k^4.
 * @author Georg Fischer
 */
public class A184848 extends A183953 {

  /** Construct the sequence. */
  public A184848() {
    super((n, k) -> n * k * k * k * k);
  }
}
