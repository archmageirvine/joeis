package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085438 <code>a(n) = Sum_{i=1..n} binomial(i+1,2)^3</code>.
 * @author Sean A. Irvine
 */
public class A085438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085438() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 28, 244, 1244, 4619, 13880, 35832, 82488});
  }
}
