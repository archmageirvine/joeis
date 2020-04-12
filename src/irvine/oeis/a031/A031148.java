package irvine.oeis.a031;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a052.A052301;

/**
 * A031148 Number of series-reduced planted trees with n leaves of 2 colors and no symmetries.
 * @author Sean A. Irvine
 */
public class A031148 extends PrependSequence {

  /** Construct the sequence. */
  public A031148() {
    super(new SkipSequence(new A052301(), 1), 2);
  }
}
