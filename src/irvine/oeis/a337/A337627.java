package irvine.oeis.a337;
// Generated by gen_seq4.pl A335669/parmof6 at 2022-07-20 21:18

import irvine.oeis.a001.A001076;
import irvine.oeis.a014.A014448;
/**
 * A337627 Odd composite integers m such that U(m)^2 == 1 (mod m) and  V(m) == 4 (mod m), where U(m) and V(m) are the m-th generalized Lucas and Pell-Lucas numbers of parameters a=4 and b=-1, respectively.
 * @author Georg Fischer
 */
public class A337627 extends A337625 {

  /** Construct the sequence. */
  public A337627() {
    super(1, new A001076(), 2, 1, new A014448(), 4);
  }
}
