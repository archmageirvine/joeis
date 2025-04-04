package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016191 Expansion of g.f. 1/((1-9*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016191() {
    super(new long[] {-108, 21}, new long[] {1, 21});
  }
}
