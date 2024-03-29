package irvine.oeis.a026;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A026151 a(n) = T(n,n), where T is the array in A026148.
 * @author Sean A. Irvine
 */
public class A026151 extends PrependSequence {

  /** Construct the sequence. */
  public A026151() {
    super(new DifferenceSequence(new A026325().skip(1)), 1, 1);
  }
}
