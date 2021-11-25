package irvine.oeis.a343;
// manually euleras at 2021-11-24 08:46

import irvine.oeis.EulerTransform;
import irvine.oeis.SkipSequence;
import irvine.oeis.a046.A046091;

/**
 * A343872 Number of planar graphs with n edges and no isolated nodes.
 * @author Georg Fischer
 */
public class A343872 extends EulerTransform {

  /** Construct the sequence. */
  public A343872() {
    super(new SkipSequence(new A046091(), 1), 1);
  }
}
