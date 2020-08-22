package irvine.oeis.a010;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a228.A228082;

/**
 * A010061 Binary self or Colombian numbers: numbers that cannot be expressed as the sum of distinct terms of the form 2^k+1 (k&gt;=0), or equivalently, numbers not of form m + sum of binary digits of m.
 * @author Sean A. Irvine
 */
public class A010061 extends ComplementSequence {

  /** Construct the sequence. */
  public A010061() {
    super(new A228082());
  }
}

