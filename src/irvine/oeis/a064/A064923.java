package irvine.oeis.a064;

import irvine.oeis.InverseSequence;

/**
 * A064923 a(n) = Min { k | A064920(k) = n }.
 * @author Sean A. Irvine
 */
public class A064923 extends InverseSequence {

  /** Construct the sequence. */
  public A064923() {
    super(2, new A064920(), 2);
  }
}

