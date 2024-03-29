package irvine.oeis.a242;
// Generated by gen_seq4.pl A101688/parmof2 at 2023-08-27 14:11

import irvine.oeis.a018.A018805;
import irvine.oeis.a101.A101688;

/**
 * A242114 Triangle read by rows: T(n,k) = number of pairs (x,y) in {1..n}X{1..n} with gcd(x,y) = k.
 * @author Georg Fischer
 */
public class A242114 extends A101688 {

  /** Construct the sequence. */
  public A242114() {
    super(1, new A018805());
  }
}
