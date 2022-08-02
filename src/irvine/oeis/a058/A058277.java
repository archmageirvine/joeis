package irvine.oeis.a058;

import irvine.oeis.NonzeroSequence;
import irvine.oeis.a014.A014197;

/**
 * A058277 Number of values of k such that phi(k) = n, where n runs through the values (A002202) taken by phi.
 * @author Sean A. Irvine
 */
public class A058277 extends NonzeroSequence {

  /** Construct the sequence. */
  public A058277() {
    super(new A014197());
  }
}
