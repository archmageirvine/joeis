package irvine.oeis.a391;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a362.A362148;

/**
 * A391591 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391591 extends IntersectionSequence {

  /** Construct the sequence. */
  public A391591() {
    super(1, new A362148(), new A391115());
  }
}
