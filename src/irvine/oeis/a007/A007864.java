package irvine.oeis.a007;

import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001156;
import irvine.oeis.transform.EulerTransform;

/**
 * A007864 Number of matrix bundles of codimension n (Euler transform of A001156).
 * @author Sean A. Irvine
 */
public class A007864 extends EulerTransform {

  /** Construct the sequence. */
  public A007864() {
    super(0, new SkipSequence(new A001156(), 2));
  }
}
