package irvine.oeis.a263;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.a007.A007146;
import irvine.oeis.transform.EulerTransform;

/**
 * A263914 Number of (not necessarily connected) simple bridgeless graphs with n nodes.
 * Euler transform of A007146. 
 * @author Georg Fischer
 */
public class A263914 extends EulerTransform {

  /** Construct the sequence. */
  public A263914() {
    super(1, new A007146());
  }
}
