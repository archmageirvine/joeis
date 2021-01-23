package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120391 Expansion of -x*(1+x-x^2+x^3+4*x^4) / ( (x^3-2*x^2-x+1)*(x^3+2*x^2-x-1) ).
 * @author Sean A. Irvine
 */
public class A120391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120391() {
    super(new long[] {1, 0, -6, 0, 5, 0}, new long[] {0, 1, 1, 4, 6, 18});
  }
}
