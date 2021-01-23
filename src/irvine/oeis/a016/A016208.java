package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016208 Expansion of 1/((1-x)*(1-3*x)*(1-4*x)).
 * @author Sean A. Irvine
 */
public class A016208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016208() {
    super(new long[] {12, -19, 8}, new long[] {1, 8, 45});
  }
}
