package irvine.oeis.a007;

import irvine.oeis.ComplementSequence;

/**
 * A007064 Numbers not of form "nearest integer to <code>n*tau", tau=(1+sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A007064 extends ComplementSequence {

  /** Construct the sequence. */
  public A007064() {
    super(new A007067());
  }
}
