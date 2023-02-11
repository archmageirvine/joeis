package irvine.oeis.a057;

import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000016;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A057772 Inverse Euler transform of A000016.
 * @author Sean A. Irvine
 */
public class A057772 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A057772() {
    super(1, new SkipSequence(new A000016(), 1));
  }
}

