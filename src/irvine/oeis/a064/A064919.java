package irvine.oeis.a064;

import irvine.oeis.InverseSequence;

/**
 * A064919 a(n) = Min { k | A064916(k) = n }.
 * @author Sean A. Irvine
 */
public class A064919 extends InverseSequence {

  /** Construct the sequence. */
  public A064919() {
    super(2, new A064916(), 2);
  }
}

