package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016196 Expansion of <code>1/((1-10x)*(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016196() {
    super(new long[] {-120, 22}, new long[] {1, 22});
  }
}
