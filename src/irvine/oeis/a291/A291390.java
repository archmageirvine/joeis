package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291390 <code>a(n) = (1/5)*A291389(n)</code>.
 * @author Sean A. Irvine
 */
public class A291390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291390() {
    super(new long[] {-25, -50, -15, 10}, new long[] {2, 17, 130, 940});
  }
}
