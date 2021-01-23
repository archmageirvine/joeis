package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257487 Expansion of ( -4+15*x-8*x^2 ) / ( (x-1)*(x^2-4*x+1) ).
 * @author Sean A. Irvine
 */
public class A257487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257487() {
    super(new long[] {1, -5, 5}, new long[] {4, 5, 13});
  }
}
