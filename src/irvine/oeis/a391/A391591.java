package irvine.oeis.a391;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a362.A362148;

/**
 * A391591 Numbers whose smallest prime exponent is less than 3 and whose largest prime exponent exceeds 3.
 * @author Sean A. Irvine
 */
public class A391591 extends IntersectionSequence {

  /** Construct the sequence. */
  public A391591() {
    super(1, new A362148(), new A391115());
  }
}
