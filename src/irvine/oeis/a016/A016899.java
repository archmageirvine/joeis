package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016899 <code>a(n) = (5n + 4)^3</code>.
 * @author Sean A. Irvine
 */
public class A016899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016899() {
    super(new long[] {-1, 4, -6, 4}, new long[] {64, 729, 2744, 6859});
  }
}
