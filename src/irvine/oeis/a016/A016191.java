package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016191 Expansion of 1/((1-9x)*(1-12x)).
 * @author Sean A. Irvine
 */
public class A016191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016191() {
    super(new long[] {-108, 21}, new long[] {1, 21});
  }
}
