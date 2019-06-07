package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099919 <code>F(3) + F(6) + F(9) + ... + F(3n), F(n) =</code> Fibonacci numbers <code>A000045</code>.
 * @author Sean A. Irvine
 */
public class A099919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099919() {
    super(new long[] {-1, -3, 5}, new long[] {0, 2, 10});
  }
}
