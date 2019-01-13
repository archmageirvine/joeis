package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016867.
 * @author Sean A. Irvine
 */
public class A016867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016867() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 279936, 19487171, 268435456, 1801088541, 8031810176L, 27512614111L, 78364164096L});
  }
}
