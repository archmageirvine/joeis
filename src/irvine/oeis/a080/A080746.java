package irvine.oeis.a080;

import irvine.oeis.a000.A000201;
import irvine.oeis.transform.InverseAronsonTransformSequence;

/**
 * A080746 Inverse Aronson transform of lower Wythoff sequence A000201.
 * @author Sean A. Irvine
 */
public class A080746 extends InverseAronsonTransformSequence {

  /** Construct the sequence. */
  public A080746() {
    super(1, new A000201());
  }
}

