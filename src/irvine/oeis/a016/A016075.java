package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016075 Expansion of 1/((1-8*x)*(1-9*x)*(1-10*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A016075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016075() {
    super(new long[] {-7920, 3382, -539, 38}, new long[] {1, 38, 905, 17290});
  }
}
