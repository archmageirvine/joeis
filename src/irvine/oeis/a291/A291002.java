package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291002.
 * @author Sean A. Irvine
 */
public class A291002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291002() {
    super(new long[] {24, -26, 9}, new long[] {6, 31, 146});
  }
}
