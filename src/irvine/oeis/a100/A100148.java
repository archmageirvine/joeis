package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100148 Structured small rhombicosidodecahedral numbers.
 * @author Sean A. Irvine
 */
public class A100148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100148() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 60, 285, 784});
  }
}
