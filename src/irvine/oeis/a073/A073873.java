package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;

/**
 * A073873 Terms of A073872 that do not change their position in the rearrangement; i.e., values of A073872(n) which equal n(n+1)/2.
 * @author Sean A. Irvine
 */
public class A073873 extends FilterSequence {

  /** Construct the sequence. */
  public A073873() {
    super(1, new A073872(), (n, k) -> Functions.TRIANGULAR.z(n).equals(k));
  }
}
