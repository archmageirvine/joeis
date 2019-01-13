package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016250.
 * @author Sean A. Irvine
 */
public class A016250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016250() {
    super(new long[] {63, -79, 17}, new long[] {1, 17, 210});
  }
}
