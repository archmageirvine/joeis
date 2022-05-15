package irvine.oeis.a142;

import irvine.oeis.a056.A056940;

/**
 * A142467 Triangle T(n,m) read by rows: T(n,m) = Product_{i=0..6} binomial(n+i,m)/binomial(m+i,m).
 * @author Sean A. Irvine
 */
public class A142467 extends A056940 {

  /** Construct the sequence. */
  public A142467() {
    super(6);
  }
}

