package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016157 Expansion of 1/((1-4x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A016157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016157() {
    super(new long[] {-40, 14}, new long[] {1, 14});
  }
}
