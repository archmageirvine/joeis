package irvine.oeis.a263;
// manually deris2/eulerx at 2021-11-04 15:02

import irvine.oeis.transform.EulerTransform;
import irvine.oeis.a007.A007146;

/**
 * A263914 Number of (not necessarily connected) simple bridgeless graphs with n nodes.
 * Euler transform of A007146. 
 * @author Georg Fischer
 */
public class A263914 extends EulerTransform {

  /** Construct the sequence. */
  public A263914() {
    super(new A007146());
  }
}
