package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016250 Expansion of 1/((1-x)(1-7x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A016250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016250() {
    super(new long[] {63, -79, 17}, new long[] {1, 17, 210});
  }
}
