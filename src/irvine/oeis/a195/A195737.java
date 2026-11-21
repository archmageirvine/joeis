package irvine.oeis.a195;

import irvine.oeis.a402.A402237;

/**
 * A195737 E.g.f.: x = Sum_{n&gt;=1} a(n)*x^n/n! * exp(-n*(n+1)/2*x).
 * @author Gregory Morse
 */
public class A195737 extends A402237 {
  /** Construct the sequence. */
  public A195737() {
    super(false);
  }
}
