package irvine.oeis.a121;
// Generated by gen_seq4.pl uvpolx at 2021-09-04 15:09

import irvine.math.polynomial.Polynomial;
import irvine.oeis.a208.A208508;

/**
 * A121462 Triangle read by rows: T(n,k) is the number of nondecreasing Dyck paths of semilength n, having pyramid weight k (1 &lt;= k &lt;= n).
 * (a,b,c,d,e,f) = (x,x, 0,x,x+1, 0)
 * @author Georg Fischer
 */
public class A121462 extends A208508 {

  /** Construct the sequence. */
  public A121462() {
    super(1, Polynomial.create(0, 1), Polynomial.create(0, 1), Polynomial.create(0), Polynomial.create(0, 1), Polynomial.create(1, 1), Polynomial.create(0));
  }
}
