package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016936 <code>a(n) = (6*n + 2)^4</code>.
 * @author Sean A. Irvine
 */
public class A016936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016936() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 4096, 38416, 160000, 456976});
  }
}
