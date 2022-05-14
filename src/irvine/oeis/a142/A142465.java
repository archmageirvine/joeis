package irvine.oeis.a142;

import irvine.oeis.a056.A056940;

/**
 * A142465 Triangle T(n,m) read by rows: T(n,m) = Product_{i=0..5} binomial(n+i,m)/binomial(m+i,m).
 * @author Sean A. Irvine
 */
public class A142465 extends A056940 {

  /** Construct the sequence. */
  public A142465() {
    super(5);
  }
}

