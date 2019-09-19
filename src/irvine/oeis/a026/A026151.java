package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.SkipSequence;

/**
 * A026151 <code>a(n) = T(n,n)</code>, where T is the array in <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A026151 extends DifferenceSequence {

  /** Construct the sequence. */
  public A026151() {
    super(new SkipSequence(new A026325(), 1));
  }
}
