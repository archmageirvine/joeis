package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016186 Expansion of 1/((1-8*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016186() {
    super(new long[] {-80, 18}, new long[] {1, 18});
  }
}
